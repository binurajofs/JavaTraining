package com.ofs.java.binu.day2.inheritance;

public class MathDemo1 extends MathDemo {
	// create methods to do sub, mul and define it.

	public int subtraction(int x, int y) {
		
		System.out.println("The difference between the given numbers:");
		return (x-y);
	}

	public int multiplication(int x, int y) {
		
		System.out.println("The product of the given numbers:");
		return (x*y);
	}

	// define add method

	public int addition(int x, int y) {
	
		System.out.println("The sum of the given numbers:");
		return(x+y);

	}

}
