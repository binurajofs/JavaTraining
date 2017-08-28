/* package com.ofs.java.binu.day2.inheritance; */
package inheritance;

public class MathDemo1 extends MathDemo {
	// create methods to do sub, mul and define it.
	// define add method 
	// this method substracts two numbers and returns the difference
	public int sub(int value_a,int value_b){
		System.out.println("This is sub method from MathDEmo1.java");
		return(value_a-value_b);
	}
	//this method multiplies two and returns the product
	public int mul(int value_a,int value_b){
		System.out.println("This is mul method from MathDemo1.java");
		return(value_a*value_b);
	}
	// this method is inherited
	//this method adds two numbers and return its sum
	public int add(int value_a,int value_b){
		return(value_a+value_b);
	}
	public int div(int value_a, int value_b) {
		// TODO Auto-generated method stub
		System.out.println("Thsi is div method from MathDemo1.java");
		if(value_b==0){
			System.out.println("Division by zero");
			return value_b;
		}
		else{
			return(value_a/value_b);
		}
	}
	
}
