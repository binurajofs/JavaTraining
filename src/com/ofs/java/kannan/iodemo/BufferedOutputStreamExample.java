package com.ofs.java.kannan.iodemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String args[]) throws Exception {
		
		try (FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
				BufferedOutputStream bout = new BufferedOutputStream(fout);) {
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
