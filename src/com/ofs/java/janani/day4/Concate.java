package com.ofs.java.janani.day4;

public class Concate {
	public static void main(String args[]){
		String n1="janani";
		String n2="jeni";
		String n3=n1.concat(n2);
		System.out.println(n1 + n2);
		System.out.println(n3);
		StringBuilder s=new StringBuilder("hello");
		s.append("java");
		System.out.println(s);
		StringBuffer s1=new StringBuffer("h1");
		s1.append("j1");
		System.out.println(s1);
		
		}

}

