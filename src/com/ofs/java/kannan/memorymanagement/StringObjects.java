package com.ofs.java.kannan.memorymanagement;

public class StringObjects {
	public static void main(String args[]) {
		String string1 = "Hello World"; //Assigning value Directly
		String string2 = new String ("Hello World");//Assigning value using Constructor
		char arr[] = {'H','e','l','l','o'};
		String string3 = new String(arr);//Passing Character array as parameter to Constructor
		
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
	}
	
}
