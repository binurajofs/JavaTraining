package com.ofs.java.binu.day2.inheritance;

public class MathDemo {
	
	// add the demo_number with every return and incretement it;
	// understand the static usage;
	
	private static int demo_number = 1;

	// create method add ; Just print a statement;
	public int addDemoNumber() {
		
		return demo_number++;
		
	}
	
	public void add() {
		
		System.out.println("The value of addition is : "+demo_number);
		
	}
	
}
