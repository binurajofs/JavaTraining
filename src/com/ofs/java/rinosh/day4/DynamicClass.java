package com.ofs.java.rinosh.day4;

class MyClass {

}

public class DynamicClass {

	public static void main(String[] args) {
		ClassLoader cl = DynamicClass.class.getClassLoader();

		try {
			Class c = cl.loadClass("MyClass");
			System.out.println("c.getName() = " + c.getName());
		} catch (Exception e) {
			System.out.println("Exception: " + e.toString());
		}

	}
}