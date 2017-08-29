package com.ofs.java.hamsa.day2;

import com.ofs.java.binu.day2.inheritance.MathDemo;
import com.ofs.java.binu.day2.inheritance.MathDemo1;
import com.ofs.java.binu.day2.inheritance.MathDemo2;


/**
 * 
 * Day 2 task main class;
 * @author binurajk
 *
 */
public class Day2Demo {

	public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		
		// call method one;
		
		methodDemo.add(2, 3);
		
		// call method two and print the return value;
		
		System.out.println("Sum is " +methodDemo.addReturns(20, 20));
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		
		// call lhs and rhs and compare the value;
		
		System.out.println("a=1 b=2 formula:ac + bc = c(a + b)");
		System.out.println("LHS is "+methodOverLoadDemo.calculateLHS(1, 2));
		System.out.println("RHS is "+methodOverLoadDemo.calculateRHS(1, 2));
		if(methodOverLoadDemo.calculateLHS(1, 2)==methodOverLoadDemo.calculateRHS(1, 2)) {
			System.out.println("Values Matching");
		}
		
		System.out.println("a=4 b=4 c=6 formula:a3 + b3 = (a + b)(a2 - ab + b2)");
		System.out.println("LFH is "+methodOverLoadDemo.calculateLHS(4, 4, 6));
		System.out.println("RFH is "+methodOverLoadDemo.calculateRHS(4, 4, 6));
		if(methodOverLoadDemo.calculateLHS(4,4,6)==methodOverLoadDemo.calculateRHS(4,4,6)) {
			System.out.println("Values Matching");
		}

		
		MathDemo mathDemo = new MathDemo();
		// call methods and print the result;
		MathDemo.demoNumberCheck();
		mathDemo.add();
		
		MathDemo1 mathDemo1 = new MathDemo1();
		// call methods and print the result;
		System.out.println("value a is 3 value b is 2");
		System.out.println("Sum is "+mathDemo1.addition(3,2));
		System.out.println("Sub is "+mathDemo1.subtraction(3,2));
		System.out.println("Mul is "+mathDemo1.multiplication(3,2));
		
		MathDemo2 mathDemo2 = new MathDemo2();
	
		System.out.println("value a is 4 value b is 5");
		System.out.println("Sum is "+mathDemo2.addition(4,5));
		System.out.println("Sub is "+mathDemo2.subtraction(4,5));
		System.out.println("Mul is "+mathDemo2.multiplication(4,5));
		System.out.println("Div is "+mathDemo2.division(4,5));

		

	}
}
