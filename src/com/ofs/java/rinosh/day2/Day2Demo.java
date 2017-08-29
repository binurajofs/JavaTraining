package com.ofs.java.rinosh.day2;

import com.ofs.java.rinosh.day2.inheritance.MathDemo;
import com.ofs.java.rinosh.day2.inheritance.MathDemo1;
import com.ofs.java.rinosh.day2.inheritance.MathDemo2;

public class Day2Demo {

	public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		// call method one;
		methodDemo.add(5, 6);
		// call method two and print the return value;
		System.out.println(methodDemo.addReturns(10, 20));

		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		System.out.println("a=2 b=3 formula:ac + bc = c(a + b)");
		System.out.println("LFH is "+methodOverLoadDemo.calculateLHS(2, 3));
		System.out.println("RHS is "+methodOverLoadDemo.calculateRHS(2, 3));
		if(methodOverLoadDemo.calculateLHS(2, 3)==methodOverLoadDemo.calculateRHS(2, 3)) {
			System.out.println("Values Matching");
		}
		
		System.out.println("a=2 b=3 c=4 formula:a3 + b3 = (a + b)(a2 - ab + b2)");
		System.out.println("LFH is "+methodOverLoadDemo.calculateLHS(2, 3, 4));
		System.out.println("RFH is "+methodOverLoadDemo.calculateRHS(2, 3, 4));
		if(methodOverLoadDemo.calculateLHS(2,3,4)==methodOverLoadDemo.calculateRHS(2,3,4)) {
			System.out.println("Values Matching");
		}

		MathDemo mathDemo = new MathDemo();
		MathDemo.demoNumberCheck();
		MathDemo.demoNumberCheck();
		mathDemo.add();
		// call methods and print the result;
		MathDemo1 mathDemo1 = new MathDemo1();
		mathDemo1.add();
		System.out.println("value a is 6 value b is 5");
		System.out.println("Sum is "+mathDemo1.add(6,5));
		System.out.println("Sub is "+mathDemo1.sub(6,5));
		System.out.println("Mul is "+mathDemo1.mul(6,5));
		System.out.println("Div is "+mathDemo1.div(6,5));
		// call methods and print the result;
		MathDemo2 mathDemo2 = new MathDemo2();
		mathDemo2.add();
		System.out.println("value a is 10 value b is 5");
		System.out.println("Sum is "+mathDemo2.add(10,5));
		System.out.println("Sub is "+mathDemo2.sub(10,5));
		System.out.println("Mul is "+mathDemo2.mul(10,5));
		System.out.println("Div is "+mathDemo2.div(10,5));

	}
}