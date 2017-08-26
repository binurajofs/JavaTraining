package com.ofs.java.karteek.day2;

import com.ofs.java.karteek.day2.inheritance.MathDemo;
import com.ofs.java.karteek.day2.inheritance.MathDemo1;
import com.ofs.java.karteek.day2.inheritance.MathDemo2;


/**
 * 
 * Day 2 task main class;
 * @author karteek
 *
 */
public class Day2Demo {

	public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		// call method one;
		// call method two and print the return value;
		methodDemo.add(50,100 );
		int add1_result = methodDemo.add1(200,100);
		System.out.println("Result of Add1 method is : "+add1_result);
		System.out.println("");
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		int rhs1 = methodOverLoadDemo.calculateRHS(1,2,3);
		int lhs1 = methodOverLoadDemo.calculateLHS(1,2,3);
		System.out.println("LHS equation with 3 variables is : "+lhs1);
		System.out.println("RHS equation with 3 variables is : "+rhs1);
		if(lhs1 == rhs1) 
			System.out.println("The Equation is correct");
		else
			System.out.println("The Equation is wrong");
		System.out.println("");
		int rhs2 = methodOverLoadDemo.calculateRHS(1,5);
		int lhs2 = methodOverLoadDemo.calculateLHS(1,5);
		System.out.println("LHS equation with 2 variables is : "+lhs2);
		System.out.println("RHS equation with 2 variables is : "+rhs2);
		if(lhs2 == rhs2) 
			System.out.println("The Equation is correct");
		else
			System.out.println("The Equation is wrong");
		System.out.println("");
		
		
		MathDemo mathDemo = new MathDemo();
		// call methods and print the result;
		mathDemo.addDemoNumber();
		mathDemo.add();
		System.out.println("");
		
		MathDemo1 mathDemo1 = new MathDemo1();
		// call methods and print the result;
		int sub_result = mathDemo1.sub(20,10);
		System.out.println("The result of subtraction is : "+sub_result);
		System.out.println("");
		
		int mul_result = mathDemo1.mul(20,10);
		System.out.println("The result of multiplication is : "+mul_result);
		System.out.println("");
		
		int add_result = mathDemo1.add(20,10);
		System.out.println("The result of addition is : "+add_result);
		System.out.println("");
		
		
		MathDemo2 mathDemo2 = new MathDemo2();
		// call methods and print the result;
		int div_result = mathDemo2.div(20,10);
		System.out.println("The result of division is : "+div_result);
		
	}
}
