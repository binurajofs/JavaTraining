package com.ofs.java.kannan.iodemo;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {

		String path = "";
		boolean bool = false;
		try {
			// createing new files
			File file = new File("d:/sample/testFile2.TXT");
			file.createNewFile();
			System.out.println(file);
			// createing new canonical from file object
			File file2 = file.getCanonicalFile();
			// returns true if the file exists
			System.out.println(file2.getCanonicalPath());
			bool = file2.exists();
			// returns absolute pathname
			path = file2.getAbsolutePath();
			System.out.println(bool);
			// if file exists
			if (bool) {
				// prints
				System.out.print(path + " Exists? " + bool);
			}
			
			
			File f=new File("d:/sample");  
		    String filenames[]=f.list();  
		    for(String filename:filenames){  
		        System.out.println(filename);  
		    }  
		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		}
	}
}
