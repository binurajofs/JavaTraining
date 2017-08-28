package com.ofs.java.binu.day2raj;

public class MethodOverLoadDemo {
	int a=3,b=4,c=5;
	// create a method to do algebra operations;
	// Method name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
public int calculateLHS(int a,int b,int c) {
int lhs=(a*c)+(b*c);
return lhs;
}
public int calculateRHS(int a,int b,int c) {
int rhs=c*(a+b);
return rhs;
}
public int calculateLHS(int a,int b) {
int lhs=(a*a*a)+(b*b*b);
return lhs;
}
public int  calculateRHS(int a, int b) {
int rhs=(a+b)*((a*a)-(a*b)+(b*b));
return rhs;
}
<<<<<<< HEAD

=======
>>>>>>> origin/rajkamal
}
