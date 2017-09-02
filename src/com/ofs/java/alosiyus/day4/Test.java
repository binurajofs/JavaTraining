package com.ofs.java.alosiyus.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*class A {
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method, i = " + i);
	}
}*/

public class Test {
	public static void main(String[] args) throws IOException {
		// Creating two instances of class A

		/*
		 * A a1 = new A(10);
		 * 
		 * A a2 = new A(20);
		 * 
		 * //Assigning a2 to a1
		 * 
		 * a1 = a2;
		 */

		// Now both a1 and a2 will be pointing same object

		// An object earlier referred by a1 will become abandoned

		// Calling garbage collector thread explicitly

		/*
		 * System.gc(); //OR call Runtime.getRuntime().gc();
		 * 
		 * System.out.println("done")
		 */;

		FileReader fr = null;
		BufferedReader br = null;
		try {
			String file = "D:\\Assignments\\JavaTraining\\src\\com\\ofs\\java\\alosiyus\\day4\\MyClass8.java";
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			System.out.println(file);
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} finally {
			if (fr != null)
				fr.close();
			if (br != null)
				br.close();
		}
	}
}