package de.sos.etj.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import de.sos.io.FileOperations;
import de.sos.logging.EclipseLogger;

public class EclipseTaskJugglerBuilder extends IncrementalProjectBuilder {

	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				buildTJP(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				buildTJP(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			buildTJP(resource);
			return true;
		}
	}

	
	public static final String BUILDER_ID = "EclipseTaskJuggler.builder";

	private static final String MARKER_TYPE = "EclipseTaskJuggler.builder";


	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return null;
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		// delete markers set and files created
		getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}

	void buildTJP(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".tjp")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
			//TODO: do the actual build
			
			try{
				String cmd_line = "";
				String absolute_tjp_file = new File(file.getLocationURI()).getAbsolutePath();
				String proj_name = file.getName().replace(".tjp", "");
				String target_dir = new File(getProject().getLocationURI()) + "\\reports\\" + proj_name;
				
				File tf = new File(target_dir);
				FileOperations.delete(tf, true);
				if (tf.exists() == false){
					tf.mkdirs();
				}
				
				
				
				String osName = System.getProperty("os.name");
				File build_file = null;
				if (osName.toLowerCase().contains("win")){
					build_file = new File(target_dir + "/build_report.cmd");
					PrintWriter writer = new PrintWriter(build_file, "UTF-8");
					String cmd_path = "tj3";
					cmd_line = cmd_path + " -o " + "\"" + target_dir + "\"" + " \"" + absolute_tjp_file + "\"";
					writer.println(cmd_line);
					writer.close();
					
					cmd_line = build_file.getAbsolutePath();
				}
				
				Process process = Runtime.getRuntime().exec(cmd_line);
				BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
				BufferedReader err = new BufferedReader(new InputStreamReader(process.getErrorStream()));
				String line = null;
				while((line = input.readLine()) != null){
					EclipseLogger.info(line);
					System.out.println(line);
				}
				while((line = err.readLine()) != null){
					EclipseLogger.error(line);
					parseError(file, line);
					System.err.println(line);
				}
				input.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

	private void parseError(IFile f, String line) {
		if (line.contains(".tjp")){
			System.out.println("Got Error Message: " + line);
			int l = line.indexOf(".tjp")+4;
			String file_name = line.substring(0, l);
			if (new File(file_name).equals(new File(f.getLocationURI()))){
				String content = line.substring(l+1);
				String[] parts = content.split(":");
				if (parts.length >= 3){
					String lineNrStr = parts[0];
					String level = parts[1].trim();
					String msg = parts[2];
					for (int i = 3; i < parts.length; i++)
						msg = ": " + parts[i];
					System.out.println(msg);
					
					int severity = IMarker.SEVERITY_INFO;
					if (level.toLowerCase().equals("warning")){
						severity = IMarker.SEVERITY_WARNING;
					}else{
						severity = IMarker.SEVERITY_ERROR;
					}
					try{
						int lineNumber = Integer.parseInt(lineNrStr);
						addMarker(f, msg, lineNumber, severity);
					}catch(Exception e){
						
					}
				}
			}
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
}
