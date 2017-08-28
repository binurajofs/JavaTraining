/* package com.ofs.java.binu.day2.inheritance; */
package inheritance;

public class MathDemo2 extends MathDemo1{
	// define div method
	// division method with parameters value_a and value_b
	public int div(int value_a,int value_b){
		System.out.println("Thsi is div method from MathDemo2.java");
		if(value_b==0){
			System.out.println("Division by zero");
			return value_b;
		}
		else{
			return(value_a/value_b);
		}
	}
}
