/* package com.ofs.java.binu.day2; */
package inheritance;

public class MethodOverLoadDemo {

	// create a method to do algebra operations;
	// Mehtod name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
	
	/*methods for calculating ac+bc=c(a+b)*/
	
	//this method calculates LHS ac+bc
	
	public int calculateLHS(int value_a,int value_b,int value_c){
		return((value_a*value_c)+(value_b*value_c));
	}
	
	//this method calculates RHS c(a+b)
	
	public int calculateRHS(int value_a,int value_b,int value_c){
		return(value_c*(value_a+value_b));
	}
	
	/*methods for calculating a3+b3=(a+b)(a2-ab+b2)*/
	
	//this method calculates LHS a3+b3
	
	public int calculateLHS(int value_a,int value_b){
		return((value_a*value_a*value_a)+(value_b*value_b*value_b));
	}
	
	//this method calculates RHS (a+b)(a2-ab+b2)
	
	public int calculateRHS(int value_a,int value_b){
		return((value_a+value_b)*((value_a*value_a)-(value_a*value_b)+(value_b*value_b)));
	}
}
