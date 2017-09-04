package com.ofs.java.binu.day4;

public class Object {

	static int count = 0;
	private Object Objects;

	public void Objects() {
		// will get memory only once and retain its value
		count++;

		System.out.println(count);
	}

	public static void main(String args[]) {

		Object c1 = new Object();
		Object c2 = new Object();
		c1.Objects();
		c2.Objects();

	}
}