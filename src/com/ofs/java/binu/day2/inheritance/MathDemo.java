package com.ofs.java.binu.day2.inheritance;

public class MathDemo {

	// add the demo_number with every return and incretement it;
	// understand the static usage;

	private static int demo_number = 1;

	public static int increment() {
		demo_number++;
		return demo_number;
	}

	// create method add ; Just print a statement;

	public int add(int a, int b) {
		return a + b;
	}
}
