package com.ofs.java.binu.day2;

public class MethodOverLoadDemo {
	
	public int calculateLHS(int a,int b)
	{
		return ((a*a*a)+(b*b*b));
	}
	public int calculateLHS(int a,int b,int c)
	{
		return ((a*c)+(b*c));
	}
	public int calculateRHS(int a,int b)
	{
		return ((a+b)*((a*a)-(a*b)+(b*b)));
		
	}
	public int calculateRHS(int a,int b,int c)
	{
		return (c*(a+b));
		
	}
}
//create a method to do algebra operations;
	// Mehtod name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
