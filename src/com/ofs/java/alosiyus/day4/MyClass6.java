package com.ofs.java.alosiyus.day4;


import java.io.FileInputStream;



import java.io.IOException;
import java.io.InputStream;




public class MyClass6 {

	public static void main(String... aArgs) throws IOException {
		InputStream input = null;
		try {
		    input = new FileInputStream("inputfile.txt");
		} 
		finally {
		   
		         input.close();
		         
		       }		    
		}
		}
	


