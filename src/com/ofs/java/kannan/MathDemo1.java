package com.ofs.java.kannan;

public class MathDemo1 extends MathDemo {
	// create methods to do sub, mul and define it.
	public int sub(int value_a,int value_b) {
		//subraction method
		System.out.println("method in MathDemo1");
		return (value_a-value_b);
	}
	public int mul(int value_a,int value_b) {
		//multiplication method
		System.out.println("method in MathDemo1");
		return (value_a*value_b);
	}
	public int div(int value_a,int value_b) {
		//division method
		System.out.println("method in MathDemo1");
		if(value_b==0) {
			System.out.println("Arithmetic Exception");
			return value_b;
		}else {
		return (value_a/value_b);
		}
	}
	public int add(int value_a,int value_b) {
		//multiplication method
		return (value_a+value_b);
	}
	// d add method 
}
