package com.ofs.java.mels.day2;

public class MethodOverLoadDemo {

	// create a method to do algebra operations;
	// Mehtod name should be calculateLHS() and calculateRHS; and calculate RHS and LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
	
	
	int calculateLHS(int a,int b,int c,int d) {
		
		int firstA=a*c;
		int firstB=b*c;
		int secondA=a*3;
		int secondB=b*3;
		
		int first=firstA+firstB;
		int second=secondA+secondB;
		if(d==1) {
			/**
			 * First formula LHS
			 * 
			 * */
			return first;
		}
		else
			return second;
	}
	
	int calculateRHS(int a,int b,int c,int d) {
		
		int firstA=a*c;
		int firstB=b*c;
		int secondAB=a+b;
		int secondBA=(a*2)-(a*b)+(b*2);
		int first=firstA+firstB;
		int second=secondAB*secondBA;
		if(d==1) {
			return first;
		}
		else
			return second;
		
		
	}
}
