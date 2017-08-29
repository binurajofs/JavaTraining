package com.ofs.java.rinosh.day2.inheritance;

public class MathDemo {

	// add the demo_number with every return and incretement it;
	// understand the static usage;

	private static int demo_number = 1;

	// create method add ; Just print a statement;
	public static void demoNumberCheck() {
		System.out.println("Demo Number Value is " + demo_number);
		demo_number++;
	}

	public void add() {
		System.out.println("This is MathDemo class add method");
	}
}