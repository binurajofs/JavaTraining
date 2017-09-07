package com.ofs.java.hamsa.day4.memorymanagement;

public class StringObject {

	public static void main(String[] args) {

		String str = "Hamsa priya dharshini";

		String str1 = new String("Hamsa priya dharshini");

		char ch[] = { 'H', 'a', 'm', 's', 'a', ' ', 'p', 'r', 'i', 'y', 'a',
				' ', 'd', 'h', 'a', 'r', 's', 'h', 'i', 'n', 'i' };
		String str2 = new String(ch);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
}
