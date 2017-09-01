package com.ofs.java.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyClose extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("Hello1.txt");
	      System.out.println("File Opened");
	      
	      FileReader fr = null;
	      // creates the file
	      try {
			file.createNewFile();
			
			fr = new FileReader(file);
		    BufferedReader br = new BufferedReader(fr);
		    String line = null;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      
	 finally {
		    if (fr != null) {
		        try {
		            fr.close();
		            System.out.println("File Closed");
		        } catch (IOException e) {
		            // This is unrecoverable. Just report it and move on
		            e.printStackTrace();
		        }
		    }
		}
	}

}
