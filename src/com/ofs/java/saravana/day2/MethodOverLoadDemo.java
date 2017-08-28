package com.ofs.java.saravana.day2;

public class MethodOverLoadDemo {

	// create a method to do algebra operations;
	// Mehtod name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
	public void calculateLHS(int a,int b,int c)
	{
		int x=((a*c)+(b*c));
		int y=(c*(a+b));
		System.out.println("((a*c)+(b*c)): "+x);
		System.out.println("(c*(a+b)): "+y);
		if(x==y) {
			System.out.println("  ac + bc = c(a + b) both expression gives the same result");
		}
		else {
			System.out.println("this expression is not true");
		}
			
	}
	public void calculateRHS(int a,int b)
	{
		int p=((a*a*a)+(b*b*b));
		int q=((a+b)*((a*a)-(a*b)+(b*b)));
		System.out.println("((a*a*a)+(b*b*b)) "+p);
		System.out.println("((a+b)*((a*a)-(a*b)+(b*b))) "+q);
		if(p==q) {
			System.out.println("a3 + b3 = (a + b)(a2 - ab + b2) both expression gives the same result");
		}
		else {
			System.out.println("this expression is not true");
		}
	}
}
