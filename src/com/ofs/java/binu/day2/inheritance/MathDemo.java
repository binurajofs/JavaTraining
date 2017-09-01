package com.ofs.java.binu.day2.inheritance;

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
	 * @param j 
	 * @param i 
	 */

	public static void demoNumberCheck1() {
		// TODO Auto-generated method stub
		
	}
	
	public final int sub1(int value_a,int value_b) {
		System.out.println("method in MathDemo1");
		return (value_a-value_b);
	}
	
	public int add(int i, int j) {
		System.out.println("This is MathDemo class add method");
		return (i+j);
	}
}