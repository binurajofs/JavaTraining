package com.ofs.java.kannan.day2.inheritance;
/**
 * 
 * @author KannaN
 * MathDemo1 class extending MathDemo
 */
public class MathDemo1 extends MathDemo {
	// create methods to do sub, mul and define it.
	/**Subraction Method 
	 * 
	 * @param value_a
	 * @param value_b
	 * @return
	 */
	public int sub(int value_a,int value_b) {
		System.out.println("method in MathDemo1");
		return (value_a-value_b);
	}
	/**
	 * Multiplication Method
	 * @param value_a
	 * @param value_b
	 * @return
	 */
	public int mul(int value_a,int value_b) {
		System.out.println("method in MathDemo1");
		return (value_a*value_b);
	}
	/**Division Method
	 * 
	 * @param value_a
	 * @param value_b
	 * @return
	 */
	public int div(int value_a,int value_b) {
		System.out.println("method in MathDemo1");
		if(value_b==0) {
			System.out.println("Arithmetic Exception");
			return value_b;
		}else {
		return (value_a/value_b);
		}
	}
	/**addition method with parameters
	 * 
	 * @param value_a
	 * @param value_b
	 * @return
	 */
	public int add(int value_a,int value_b) {
		return (value_a+value_b);
	}
	
}
