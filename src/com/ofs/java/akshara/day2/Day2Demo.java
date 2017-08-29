package com.ofs.java.akshara.day2;

import com.ofs.java.akshara.day2.MathDemo;
import com.ofs.java.akshara.day2.MathDemo1;
import com.ofs.java.akshara.day2.MathDemo2;
import com.ofs.java.akshara.day2.MethodOverLoadDemo;

/**
 * 
 * Day 2 task main class;
 * @author binurajk
 *
 */
public class Day2Demo {

	public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		methodDemo.addition(5,10);// call method one;
		methodDemo.sum(5,5);// call method two and print the return value;
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		System.out.println("a=5,b=4,c=3");
		int lhs=methodOverLoadDemo.calculateLHS(5,4,3);// call lhs and rhs and compare the value;
		int rhs=methodOverLoadDemo.calculateRHS(5,4,3);
		if(lhs==rhs)
			System.out.println("LHS=RHS");
		MathDemo mathDemo = new MathDemo();
		System.out.println("Demo No."+mathDemo.increment());
		mathDemo.add();// call methods and print the result;
		MathDemo1 mathDemo1 = new MathDemo1();
		System.out.println(mathDemo1.add(10,10));
		System.out.println("Subtraction:"+mathDemo1.sub(30,10));
		System.out.println("Multiplication:"+mathDemo1.mul(30,10));// call methods and print the result;
		MathDemo2 mathDemo2 = new MathDemo2();
		System.out.println("Division:"+mathDemo2.div(30,10));
	}

}
