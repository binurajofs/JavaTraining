package com.ofs.java.kannan.iodemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String args[]) throws IOException {
		FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
		fileOutputStreamExample.writeString()
;	}

	void writeChar() throws IOException {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("D:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (null != fout) {
				fout.close();
			}
		}
	}

	void writeString() throws IOException {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("D:\\testout.txt");
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b, 6, 5);
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (null != fout) {
				fout.close();
			}
		}
	}
}