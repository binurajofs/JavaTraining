package com.ofs.java.binu.day2;

// Method name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
// Pass inputs as parameter;
// 1) ac + bc = c(a + b)
// 2) a3 + b3 = (a + b)(a2 - ab + b2)
// methods with return type;

public class MethodOverLoadDemo {
	int x=0,y=0;

	// create a method to do algebra operations;
	int calculateLHS(int a, int b, int c) // creating method for LHS (three arguments)
	{
				x=((a*c)+(b*c));
		return x;                         // returning x value
	}
	int calculateRHS(int a,int b, int c)  // creating method for RHS
	{
	     y= c*(a+b);
	     return y;                        // returning y value
	}
	int calculateLHS(int a, int b)        // creating method for LHS (two arguments)
	{
				x=((a*a*a)+(b*b*b));
		        return x;                 // returning x value
	}
	int calculateRHS(int a,int b)         // creating method for RHS
	{ 
	     y = ((a+b)*((a*a)-(a*b)+(b*b)));
	     return y;                        // returning x value
	}
	
}                                         // end program
