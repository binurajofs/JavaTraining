/* package com.ofs.java.binu.day2.inheritance; */
package inheritance;

public class MathDemo {
	
	// add the demo_number with every return and incretement it;
	// understand the static usage;
	
	private static int demo_number = 1;
	public static void demoNumberCheck(){
		System.out.println("Demo Number Value is "+demo_number);
		demo_number++;
	}

	// create method add ; Just print a statement;
	// add method that prints a statement
	public void add(){
		System.out.println("This is add method in class MathDemo.java");
	}
}
