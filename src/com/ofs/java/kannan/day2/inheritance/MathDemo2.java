package com.ofs.java.kannan.day2.inheritance;

public class MathDemo2 extends MathDemo1{
	
	public int div(int value_a,int value_b) {
		//division method
		System.out.println("method in MathDemo2");
		if(value_b==0) {
			System.out.println("Arithmetic Exception");
			return value_b;
		}else {
		return (value_a/value_b);
		}
	}
}
