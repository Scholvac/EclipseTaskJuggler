package de.sos.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileOperations {

	
	public static String getRelativePathToDirectory(String file, String relativeTo) throws IOException{
		return getRelativePathToDirectory(new File(file), new File(relativeTo));
	}
	public static String getRelativePathToDirectory(File file, File file2) throws IOException {
		if (file2.isDirectory()==false)
			return getRelativePath(file, file2.getParentFile());
		else
			return getRelativePath(file, file2);
	}
	public static String getRelativePath(String file, String relativeTo) throws IOException
	{
		return getRelativePath(new File(file), new File(relativeTo));
	}
	public static String getRelativePath(File file, File relativeTo)
			throws IOException {
		//Übernommen von: http://forums.sun.com/thread.jspa?threadID=584546
		//Autor:  rioriorio945  06.01.2005 07:19
		file = new File(file + File.separator + "89243jmsjigs45u9w43545lkhj7")
				.getParentFile();
		relativeTo = new File(relativeTo + File.separator
				+ "984mvcxbsfgqoykj30487df556").getParentFile();
		File origFile = file;
		File origRelativeTo = relativeTo;
		ArrayList filePathStack = new ArrayList();
		ArrayList relativeToPathStack = new ArrayList();
		// build the path stack info to compare it afterwards
		file = file.getCanonicalFile();
		while (file != null) {
			filePathStack.add(0, file);
			file = file.getParentFile();
		}
		relativeTo = relativeTo.getCanonicalFile();
		while (relativeTo != null) {
			relativeToPathStack.add(0, relativeTo);
			relativeTo = relativeTo.getParentFile();
		}
		// compare as long it goes
		int count = 0;
		file = (File) filePathStack.get(count);
		relativeTo = (File) relativeToPathStack.get(count);
		while ((count < filePathStack.size() - 1)
				&& (count < relativeToPathStack.size() - 1)
				&& file.equals(relativeTo)) {
			count++;
			file = (File) filePathStack.get(count);
			relativeTo = (File) relativeToPathStack.get(count);
		}
		if (file.equals(relativeTo))
			count++;
		// up as far as necessary
		StringBuffer relString = new StringBuffer();
		for (int i = count; i < relativeToPathStack.size(); i++) {
			relString.append(".." + File.separator);
		}
		// now back down to the file
		for (int i = count; i < filePathStack.size() - 1; i++) {
			relString.append(((File) filePathStack.get(i)).getName()
					+ File.separator);
		}
		relString.append(((File) filePathStack.get(filePathStack.size() - 1))
				.getName());
		// just to test
		File relFile = new File(origRelativeTo.getAbsolutePath()
				+ File.separator + relString.toString());
		if (!relFile.getCanonicalFile().equals(origFile.getCanonicalFile())) {
			throw new IOException("Failed to find relative path.");
		}
		return relString.toString();
	}
	public static void createDir(String dir, boolean overwrite)
			throws IOException {

		File f = new File(dir);
		if (f.exists() && overwrite) {
			deleteDir(dir);
		}
		if (!f.mkdirs())
			throw new RuntimeException(
					"Konnte das Temporï¿½re Verzeichnis tmp nicht erstellen. " + dir);
		f = null;

	}

	public static void deleteDir(String dir) throws IOException {
		File f = new File(dir);
		if (f.isDirectory()) {
			File[] fl = f.listFiles();
			for (int i = 0; i < fl.length; i++) {
				deleteDir(fl[i].getAbsolutePath());
			}
		}
		if (!f.delete())
			throw new IOException("Konnte das Verzeichnis <tmp> nicht lï¿½schen.");
		f = null;
	}

	public static boolean copyDir(String src, String dest, boolean overwrite, boolean verbose) throws IOException {
		return copyDir(src, dest, overwrite, verbose, false, null);
	}
	public static boolean copyDir(String src, String dest, boolean overwrite) throws IOException {
		return copyDir(src, dest, overwrite, false, false, null);
	}
	public static boolean copyDir(String src, String dest, boolean overwrite, FileFilter fileFilter) throws IOException {
		return copyDir(src, dest, overwrite, false, false, fileFilter);
	}
	public static boolean copyDirNew(String src, String dest, boolean overwrite, boolean verbose) throws IOException {
		return copyDir(src, dest, overwrite, verbose, true, null);
	}
	public static boolean copyDirNew(File src, File dest, boolean overwrite) throws IOException {
		return copyDir(src.getAbsolutePath(), dest.getAbsolutePath(), overwrite, false, true, null);
	}
	public static boolean copyDirNew(String src, String dest, boolean overwrite) throws IOException {
		return copyDir(src, dest, overwrite, false, true, null);
	}
	public static boolean copyDirNew(String src, String dest, boolean overwrite, FileFilter fileFilter) throws IOException {
		return copyDir(src, dest, overwrite, false, true, fileFilter);
	}
	public static boolean copyDir(File src, File dst, boolean overwrite) throws IOException {
		return copyDir(src.getAbsolutePath(), dst.getAbsolutePath(), overwrite);
	}
	public static boolean copyDir(File src, File dst, boolean overwrite, boolean verbose) throws IOException {
		return copyDir(src.getAbsolutePath(), dst.getAbsolutePath(), overwrite, verbose);
	}
	public static boolean copyDir(File src, File dst, boolean overwrite, FileFilter fileFilter) throws IOException {
		return copyDir(src.getAbsolutePath(), dst.getAbsolutePath(), overwrite, fileFilter);
	}
	
	public static boolean copyDir(String src, String dest, boolean overwrite, boolean verbose, boolean onlynew, FileFilter fileFilter) throws IOException {
		File source = new File(src);
		if (!source.exists()){
			if (!verbose){
				System.out.println("Source " + src + " does not exist");
			}
			return false;
		}
		File target = new File(dest);
		if (!target.isDirectory())
			createDir(target.getAbsolutePath(), overwrite);
		File[] fl = null;
		if (fileFilter != null)
			fl = source.listFiles(fileFilter);
		else
			fl = source.listFiles();
		if (fl == null){
			if (!verbose)
				System.out.println("Empty Directory");
			return false;
		}
		boolean res = true;
		for (int i = 0; i < fl.length; i++)
			if (fl[i].isDirectory()){
				String tmp = dest+"/" + fl[i].getName();
				res = res & copyDir(fl[i].getAbsolutePath(), tmp, overwrite, verbose, onlynew, fileFilter);
				if (!verbose && res)
					System.out.println("CopyDir: "+fl[i].getAbsolutePath()+" to: "+tmp);
			}else {
				String[] tmp = fl[i].getPath().replace("\\", "/").split("/");
				String filename = tmp[tmp.length - 1];
				res = res & copy(fl[i].getAbsolutePath(), dest + "/" + filename, overwrite, onlynew);
				if (!verbose && res)
					System.out.println("CopyFile: "+fl[i].getAbsolutePath()+" to: "+dest + "/" + filename);
				
			}
		return res;
	}

	public static boolean copy(String src, String dest, boolean overwrite, boolean onlynew) throws IOException {
		File t = new File(dest);
		if (t.exists() && !overwrite)
			return false;
		File s =new File(src);
		if (onlynew){
			if (t.lastModified() >= s.lastModified())
				return false;
		}else
			return false;
		
		String tmp = t.getAbsolutePath().replace(t.getName(), "");
		File t2 = new File(tmp);
		if (t2.exists() && !t2.isDirectory() && !overwrite){
			return false;
		}
		if (!t2.exists())
			createDir(tmp, overwrite);
		
		FileInputStream f_in = null;
		FileOutputStream f_out = null;

		try {
			// Streams ï¿½ffnen
			f_in = new FileInputStream(src);
			f_out = new FileOutputStream(dest);

			// eigentliches Kopieren blockweise
			byte buffer[] = new byte[1000];
			int n_bytes;
			for (;;) {
				n_bytes = f_in.read(buffer);
				if (n_bytes == -1)
					break;
				f_out.write(buffer, 0, n_bytes);
			}
		} catch (IOException e) {
			System.err.println(e.toString());
		} finally {
			// auf jeden Fall aufrï¿½umen
			if (f_in != null)
				try {
					f_in.close();
				} catch (IOException e) {
				}
			if (f_out != null)
				try {
					f_out.close();
				} catch (IOException e) {
				}
		}
		return true;
	}

	
	
	public static File searchFile(String name, String root, int depth) {
		ArrayList<File> fl = readAllFilesOfDirectory(root, depth);
		for (int i = 0; i < fl.size(); i++)
			if (fl.get(i).getAbsolutePath().endsWith(name))
				return fl.get(i);
		return null;
	}


	public static File searchFile(String name, String root) {
		return searchFile(name, root, -1);
	}
	public static ArrayList<File> readAllFiles(String path, int depth, FileFilter filter){
		return readAllFiles(path, depth, filter, false);
	}
	public static ArrayList<File> readAllFiles(String path, int depth, FileFilter filter, boolean Selectdirectory){
		if (depth == 0)
			return null;
		File f = new File(path);
		ArrayList<File> fileList = new ArrayList<File>();
		File[] fa = null;
		if (filter != null)
			fa= f.listFiles(filter);
		else
			fa = f.listFiles();
		if (fa == null)
			return null;
		for (int i = 0; i < fa.length; i++){
			if (fa[i].isDirectory()){
				if (Selectdirectory)
					fileList.add(fa[i]);
				ArrayList<File> tmp = readAllFiles(fa[i].getAbsolutePath(), depth-1, filter, Selectdirectory);
				if (tmp != null)
					fileList.addAll(tmp);
			}else
				fileList.add(fa[i]);
		}
		return fileList;
	}
	
	public static ArrayList<File> readAllFilesOfDirectory(String path, int depth) {
		return readAllFiles(path, depth, null);
	}


	public static void delete(String target, boolean recursiv) throws IOException {
		File f = new File(target);
		if (!f.exists())
			return ;
		if (f.isDirectory() && recursiv)
			deleteDir(target);
		else
			if (!f.delete())
				throw new IOException("Fehler beim Lï¿½schen der Datei: "+target);

	}

	public static void cut(String source, String target,boolean overwrite, boolean recursiv) throws IOException {
		cut(source, target, overwrite, recursiv, false);
	}
	public static void cut(String source, String target,boolean overwrite, boolean recursiv, boolean verbose) throws IOException {
		File s = new File(source);
		if (!s.exists()) 
			return;
		File t = new File(target);
		if (t.exists() && !overwrite) 
			return ;
		if (s.isDirectory()){
			copyDir(source, target, overwrite, verbose);
			delete(source, true);
		}else{
			copy(source, target, overwrite, true);
			delete(source, false);
		}
	}

	public static void rename(String source, String target, boolean overwrite) {
		File f = new File(source);
		if (!f.exists())
			return ;
		File t = new File(target);
		if (t.exists() && !overwrite){
			return;
		}
		f.renameTo(t);
	}

	public static void decompress(String source, String target,
			boolean overwrite) throws ZipFileException, IOException {
		Zip.decompressZip(new File(source), target, overwrite);
		
	}
	public static void compress(String root, String[] source, String target, boolean recursiv, boolean overwrite) throws ZipFileException, IOException {
		if (new File(target).exists() && overwrite)
			delete(target, false);
		ArrayList<File> fileList = new ArrayList<File>();
		for (int i = 0; i < source.length; i++){
			File f = new File(source[i]);
			if (!f.exists())
				continue;
			if (f.isDirectory() && recursiv){
				ArrayList<File> tmp = readAllFilesOfDirectory(f.getAbsolutePath(), -1);
				fileList.addAll(tmp);
			}else
				fileList.add(f);
		}
		Zip.compressZip(root, fileList, target, false);
	}
	public static void compress(String root, String[] source, String target, boolean recursiv) throws ZipFileException, IOException {
		compress(root, source, target, recursiv, false);
	}

	public static void createDir(File dir, boolean overwrite) throws IOException {
		createDir(dir.getAbsolutePath(), overwrite);
	}

	public static void copy(File src, File dest, boolean overwrite) throws IOException {
		copy(src.getAbsolutePath(), dest.getAbsolutePath(), overwrite, false);		
	}
	public static void copyNew(File src, File dest, boolean overwrite) throws IOException {
		copy(src.getAbsolutePath(), dest.getAbsolutePath(), overwrite, true);		
	}

	public static void deleteDir(File dir) throws IOException {
		deleteDir(dir.getAbsolutePath());		
	}

	public static void delete(File file, boolean recursive) throws IOException {
		delete(file.getAbsolutePath(), recursive);		
	}

}

