package com.ofs.java.rinosh.day2.inheritance;

public class MathDemo2 extends MathDemo1{
	// define div method
	public int div(int value_a,int value_b) {
		System.out.println("method in MathDemo2");
		if(value_b==0) {
			System.out.println("Arithmetic Exception");
			return value_b;
		}else {
		return (value_a/value_b);
		}
	}
}