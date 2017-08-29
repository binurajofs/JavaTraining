package com.ofs.java.binu.day2;

import com.ofs.java.binu.day2.inheritance.MathDemo;
import com.ofs.java.binu.day2.inheritance.MathDemo1;
import com.ofs.java.binu.day2.inheritance.MathDemo2;

/**
 * 
 * Day 2 task main class;
 * 
 * @author binurajk
 *
 */
public class Day2Demo {

	public static void main(String args[]) {

		MethodDemo methodDemo = new MethodDemo();
		methodDemo.addition();
		// call method one;
		System.out.println(methodDemo.addition(5, 10));
		// call method two and print the return value;

		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		 methodOverLoadDemo.calculateLHS(5, 6, 7);
		 methodOverLoadDemo.calculateRHS(5, 6);
		
		// call lhs and rhs and compare the value;

		MathDemo mathDemo = new MathDemo();
		// call methods and print the result;
		MathDemo1 mathDemo1 = new MathDemo1();

		System.out.println(mathDemo1.add(3, 4));
		System.out.println(mathDemo1.sub(3, 4));
		System.out.println(mathDemo1.mul(3, 4));
		// call methods and print the result;
		MathDemo2 mathDemo2 = new MathDemo2();
	
		System.out.println(mathDemo1.add(3, 4));
		System.out.println(mathDemo2.sub(3, 4));
		System.out.println(mathDemo2.mul(3, 4));
		System.out.println(mathDemo2.div(3, 4));
	

	}
}
