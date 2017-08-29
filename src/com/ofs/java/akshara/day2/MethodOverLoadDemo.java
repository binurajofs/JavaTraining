package com.ofs.java.akshara.day2;

public class MethodOverLoadDemo {

	public int calculateLHS(int val1, int val2, int val3) {
		int calc;
		calc=val1*val3+val2*val3;
		return calc;
	}
	public int calculateRHS(int val1,int val2,int val3) {
		return val3*(val1+val2);
	}
	public int calculateRHS(int val1,int val2) {
		int square;
		square=(val1+val2)*(val1*val1-val1*val2+val2*val2);
		return square;
	}
	public int calculateLHS(int val1,int val2) {
		return (val1*val1*val1)+(val2*val2*val2);
	}// create a method to do algebra operations;
	// Mehtod name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
}
