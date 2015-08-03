package de.sos.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;


public class Zip {
	
	public static ArrayList<File> decompress(File file, String target, boolean overwrite) throws ZipFileException, IOException {
		return decompress(file, target, overwrite, false);
	}
	public static ArrayList<File> decompress(File file, String target, boolean overwrite, boolean force) throws ZipFileException, IOException {
		if (file.getAbsolutePath().endsWith(".zip") || force)
			return decompressZip(file, target, overwrite);
		
		return null;
	}

	public static void compressZip(String rootDir, String target, boolean overwrite) throws ZipFileException{
		ArrayList<File> fileList = FileOperations.readAllFilesOfDirectory(rootDir, -1);
		compressZip(rootDir, fileList, target, overwrite);
	}
	
	public static void compressZip(String root, ArrayList<File> fileList, String target, boolean overwrite) throws ZipFileException{
		File f = new File(target);
		if (f.exists() && !overwrite)
			throw new ZipFileException("Datei "+target+" exisitiert bereits.");
		int read = 0;
		FileInputStream in ;
		byte[] data = new byte[1024];
		try{
			if (!root.endsWith(File.separator))
				root+=File.separator;
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(target));
			out.setMethod(ZipOutputStream.DEFLATED);
			
			for (int i = 0; i < fileList.size(); i++){
				String name = fileList.get(i).getPath().replace(root, "");
				ZipEntry entry = new ZipEntry(name);
				in = new FileInputStream(fileList.get(i).getPath());
				out.putNextEntry(entry);
				while((read = in.read(data, 0, 1024)) != -1)
					out.write(data,0,read);
				out.closeEntry();
				in.close();
				System.out.println(name+"...hinzugef�gt");
			}
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static ArrayList<File> decompressZip(File f, String target, boolean overwrite) throws ZipFileException, IOException{
		java.io.File targetFile = new java.io.File(target);
		if (targetFile.exists() && !overwrite)
			throw new ZipFileException("Verzeichnis oder Datei : "+target+" besteht bereits");
		targetFile.mkdirs();
		ZipFile zf = new ZipFile(f.getAbsolutePath());
		Enumeration<? extends ZipEntry> entries = zf.entries();
		ArrayList<File> out = new ArrayList<File>();
		while(entries.hasMoreElements()){
			ZipEntry entry = entries.nextElement();
			out.add(saveEntry(entry, zf, target));
			System.out.println(target+File.separator+entry.getName()+"....unziped");
		}
		zf.close();
		return out;
	}
	private static File saveEntry(ZipEntry entry, ZipFile zf, String target) throws IOException {
		File f = new File(target +"/"+ entry.getName());
		if (entry.isDirectory())
			f.mkdirs();
		else{
			InputStream is = zf.getInputStream(entry);
			BufferedInputStream bis = new BufferedInputStream(is);
			new File(f.getParent()).mkdirs();
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			final int EOF = -1;
			for (int c; (c = bis.read() ) != EOF;)
				bos.write((byte)c);
			is.close();
			bos.close();
			fos.close();
		}
		return f;
	}

	public void compressZip(File root, File target, boolean overwrite) throws ZipFileException {
		compressZip(root.getAbsolutePath(), target.getAbsolutePath(), overwrite);		
	}
}
