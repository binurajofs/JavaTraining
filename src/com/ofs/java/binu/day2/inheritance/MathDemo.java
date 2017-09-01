package com.ofs.java.binu.day2.inheritance;

public class MathDemo {

	// add the demo_number with every return and increment it;
	// understand the static usage;

	private static int demo_number = 1;

	// create method add ; Just print a statement;
	public static void demoNumberCheck() {
		System.out.println("Demo Number value is " + demo_number);
		demo_number++;

	}

	public void add() {
		System.out.println("This is Mathdemo class add method");
	}
}
