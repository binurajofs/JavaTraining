package com.ofs.java.kannan;

public class MathDemo {
	
	// add the demo_number with every return and increment it;
	// understand the static usage;
	
	private static int demo_number = 1;

	public static void demoNumberCheck() { //static function to understand how static variable works
		System.out.println("Demo Number Value is "+demo_number);
		demo_number++;
	}
	// create method add ; Just print a statement;
	public void add() {
		System.out.println("This is MathDemo class add method");
	}
}
