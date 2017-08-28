package com.ofs.java.vinitha.day2.inheritance;
/**
 * 
 * @author vinitha
 * Math Demo Class
 * 
 *
 */
public class MathDemo {
	
	// add the demo_number with every return and increment it;
	// understand the static usage;
	
	private static int demo_number = 1;
	/**
	 * Static Function to use static variables
	 */
	public static void demoNumberCheck() { 
		System.out.println("Demo Number Value is "+demo_number);
		demo_number++;
	}
	/**
	 * add method with no parameters and return
	 */
	public void add() {
		System.out.println("This is MathDemo class add method");
	}
}
