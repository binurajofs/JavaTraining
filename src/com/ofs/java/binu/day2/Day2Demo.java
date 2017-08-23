package com.ofs.java.binu.day2;

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
		methodDemo.add(10,20);
		// call method two and print the return value;
		System.out.println("The add value "+methodDemo.add(10, 20, 30));
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		
		MathDemo mathDemo = new MathDemo();
		// call methods and print the result;
		
		MathDemo1 mathDemo1 = new MathDemo1();
		// call methods and print the result;
		System.out.println("The multiplicated value is "+ mathDemo1.mul(10, 5));
		System.out.println("The subtracted value is "+ mathDemo1.sub(10, 5));
		System.out.println("The added value is "+ mathDemo1.add(10, 5));
		
		MathDemo2 mathDemo2 = new MathDemo2();
        mathDemo2.div(4, 2);
	}
}
