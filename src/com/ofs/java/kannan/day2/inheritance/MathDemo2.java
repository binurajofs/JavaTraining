package com.ofs.java.kannan.day2.inheritance;

/**\
 * MathDemo2 Class Extending MathDemo1
 * @author KannaN
 *
 */
public class MathDemo2 extends MathDemo1{
	/**
	 * Division Method
	 * @param value_a
	 * @param value_b		
	 */
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
