package com.ofs.java.rinosh.day4;

public class StringObject {

	public static void main(String[] args) {
		// First method to create String object
		String s1 = "Helloooo !!";
		// Second method to create String object
		char[] ch = { 'R', 'i', 'n', 'o', 's', 'h' };
		String s2 = new String(ch);
		// Third method to create String Object
		String s3 = new String("Boy");
		// Displaying so created strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}