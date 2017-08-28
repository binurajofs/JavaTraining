package com.ofs.java.saravana.day2;

import com.ofs.java.saravana.day2.inheritance.*;


/**
 * 
 * Day 2 task main class;
 * @author binurajk
 *
 */
public class Day2Demo {

	public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		methodDemo.add();
		// call method one;
		
		System.out.println("second add method result from MethodDemo "+ methodDemo.add1());
		
		
		
		// call method two and print the return value;
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		 System.out.println();
		System.out.println("----------calculateLHS--------------");
		methodOverLoadDemo.calculateLHS(10,20,30);
		System.out.println("----------calculateRHS--------------");
		methodOverLoadDemo.calculateRHS(10, 20);
		
		MathDemo mathDemo = new MathDemo();
		 System.out.println();
		 System.out.println("___________INHERITANCE____________");
		 System.out.println();
	    mathDemo.add();
	    System.out.println("Increament result from MathDemo: "+MathDemo.add1());
		// call methods and print the result;
		
		MathDemo1 mathDemo1 = new MathDemo1();
		 System.out.println();
		mathDemo1.sub();
		mathDemo1.mul();
		// call methods and print the result;
		
		MathDemo2 mathDemo2 = new MathDemo2();
		 System.out.println();
		mathDemo2.div();

	}
}
