package com.ofs.java.binu.day2;

public class MethodOverLoadDemo {
 
	// create a method to do algebra operations;
	// Mehtod name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	public int calculateLHS(int a,int b,int c) {
		int l1=((a*c)+(b*c));
		int r1=(c*(a+b));
		return l1=r1;
	}
	public int calculateRHS(int a,int b) {
		int l1=((a*a*a)+(b*b*b));
    
		int r1=(a+b)+((a*a)-(a*b)+(b*b));
		return l1=r1;
	}

	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
}
