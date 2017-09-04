package com.ofs.java.binu.day4;

public class LoadingClass {
	public static void main(String[] args) {

		LoadClass obj1 = new LoadClass();
		obj1.print1();
		ClassLoader cl = LoadingClass.class.getClassLoader();
		try {
			Class<?> cls = cl.loadClass("LoadClass");

		} catch (ClassNotFoundException e) {
			System.out.println("Exception:" + e);
		}
	}
}
