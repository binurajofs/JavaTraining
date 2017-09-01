package com.ofs.java.hamsa.day4.memorymanagement;

public class StrConcat {

	public static void main(String args[]) {

		String firstname = "hello";
		String lastname = "world";

		// using + operator Concat
		String name = firstname + " " + lastname;
		System.out.println(name);

		// using StringBuffer
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(firstname).append(" ").append(lastname);
		System.out.println(sBuffer.toString());

		// using StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(firstname).append(" ").append(lastname);
		System.out.println(sb.toString());

	}

}
