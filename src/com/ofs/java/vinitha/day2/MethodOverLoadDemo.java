
package com.ofs.java.blaze1457.day2;

/**
 * 
 * @author blaze
 *
 */
public class MethodOverLoadDemo {
	// create a method to do algebra operations;
	// Method name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
	/**
	 * LHS for ac+bc=c(a+b)
	 * @param value_a
	 * @param value_b
	 * @param value_c
	 * @return
	 */
	public int calculateLHS(int value_a,int value_b,int value_c) {
		
		return ((value_a*value_c)+(value_b*value_c));
	}
	/**
	 * LHS for a3 + b3 = (a + b)(a2 - ab + b2)
	 * @param value_a
	 * @param value_b
	 * @return
	 */
	public int calculateLHS(int value_a,int value_b) {
		
		return ((value_a*value_a*value_a)+(value_b*value_b*value_b));
	}
	/**
	 * RHS for ac+bc=c(a+b)
	 * @param value_a
	 * @param value_b
	 * @param value_c
	 * @return
	 */
	public int calculateRHS(int value_a,int value_b,int value_c) {
		
		return (value_c*(value_a+value_b));
	}
	/**
	 * RHS for a3 + b3 = (a + b)(a2 - ab + b2)
	 * @param value_a
	 * @param value_b
	 * @return
	 */
	public int calculateRHS(int value_a,int value_b) {
		
		return ((value_a+value_b)*((value_a*value_a)-(value_a*value_b)+(value_b*value_b)));
				
	}
}
