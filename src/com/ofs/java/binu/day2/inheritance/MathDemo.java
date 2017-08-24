package com.ofs.java.binu.day2.inheritance;

public class MathDemo {   // creating class
	
	// add the demo_number with every return and increment it;
	// understand the static usage;
	// create method add ; Just print a statement;
	
	private static int demo_number = 1;

	public static void demoNumber() {
		demo_number++;
		System.out.println("Demo Number value is "+demo_number); // print number
	}
	
	public void add() {                                    // method creation
		System.out.println("Addition");        
	}
	
}                                                      // end program
