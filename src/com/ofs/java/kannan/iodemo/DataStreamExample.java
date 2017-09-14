package com.ofs.java.kannan.iodemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * @author Kannan
 *
 */
public class DataStreamExample {
	public static void main(String args[]) throws IOException {
		DataStreamExample dataStreamExample = new DataStreamExample();
		dataStreamExample.readDataFromFile();
	}

	/**
	 * reading from file
	 * @throws IOException
	 */
	void readDataFromFile() throws IOException {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream("D:\\testout.txt");
			int i ;
			while (( i = fin.read()) != -1) {
				System.out.print((char) i);
			}

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (null != fin) {
				fin.close();
			}
		}
	}
}
