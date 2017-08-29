package com.ofs.java.rinosh.day2.inheritance;

public class MathDemo1 extends MathDemo {
	// create methods to do sub, mul and define it.
	// define add method
	public int sub(int value_a, int value_b) {
		System.out.println("method in MathDemo1");
		return (value_a - value_b);
	}

	//Multiplication Method
	public int mul(int value_a, int value_b) {
		System.out.println("method in MathDemo1");
		return (value_a * value_b);
	}

	//Division Method
	public int div(int value_a, int value_b) {
		System.out.println("method in MathDemo1");
		if (value_b == 0) {
			System.out.println("Arithmetic Exception");
			return value_b;
		} else {
			return (value_a / value_b);
		}
	}

	//addition method with parameters
	public int add(int value_a, int value_b) {
		return (value_a + value_b);
	}
}