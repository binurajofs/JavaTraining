package com.ofs.java.mels.day2;

import com.ofs.java.mels.day2.inheritance.MathDemo;
import com.ofs.java.mels.day2.inheritance.MathDemo1;
import com.ofs.java.mels.day2.inheritance.MathDemo2;


/**
 * 
 * Day 2 task main class;
 * @author binurajk
 *
 */
public class Day2Demo {

	public static void main(String args[]) {
		System.out.println("PROGRAM-1\n");
		MethodDemo methodDemo = new MethodDemo();
		System.out.println("input: a=5 b=10 ");
		// call method one;
		System.out.println("Method one result :");
		methodDemo.add();
		// call method two and print the return value;
		System.out.println("Method two result with return:");
		System.out.println(methodDemo.add(5, 10));
		
		System.out.println("\nPROGRAM-2\n");
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		/**
		 * First formula LHS
		 * 
		 * */
		int firstLhs=methodOverLoadDemo.calculateLHS(1, 2, 3, 1);
		/**
		 * First formula RHS
		 * 
		 * */
		int firstRhs=methodOverLoadDemo.calculateRHS(1, 2, 3, 1);
		/**
		 * second formula LHS
		 * 
		 * */
		int secondLhs=methodOverLoadDemo.calculateLHS(1, 2, 3, 2);
		/**
		 * second formula RHS
		 * 
		 * */
		int secondRhs=methodOverLoadDemo.calculateRHS(1, 2, 3, 2);
		if(firstLhs==firstRhs) {
			
			System.out.println("FORMULA: ac + bc = c(a + b)\nINPUTS: a=1 b=2 c=3 \nLHS:"+firstLhs+"\nRHS:"+firstRhs+"\nis valid\n");
			
		}else {
			System.out.println("FORMULA: ac + bc = c(a + b)\nINPUTS: a=1 b=2 c=3 \nLHS:"+firstLhs+"\nRHS:"+firstRhs+"\nis invalid\n");
			
		}
		
		
		if(secondLhs==secondRhs) {
			
			System.out.println("FORMULA: ac + bc = c(a + b)\nINPUTS: a=1 b=2 c=3 \nLHS:"+secondLhs+"\nRHS:"+secondRhs+"\nis valid");
			
		}else {
			System.out.println("FORMULA: ac + bc = c(a + b)\nINPUTS: a=1 b=2 c=3 \nLHS:"+secondLhs+"\nRHS:"+secondRhs+"\nis invalid");
		}
		
		System.out.println("\nMathDemo\n");
			MathDemo mathDemo = new MathDemo();
			// call methods and print the result;
			
			System.out.println("INPUTS: A=3 B=4");
			System.out.print("Calling parent class: ");
			System.out.println(mathDemo.add());
			
		
		System.out.println("\nMathDemo1\n");
			MathDemo1 mathDemo1 = new MathDemo1();
			// call methods and print the result;
			System.out.println("INPUTS: A=3 B=4");
			
			System.out.print("Calling parent class: ");
				System.out.println(mathDemo1.add());
				
			System.out.print("Calling child class:");
				System.out.println(mathDemo1.add(3, 4));
				
			System.out.print("Sub(3,4)=");
				System.out.println(mathDemo1.sub(3, 4));
				
			System.out.print("Mul(3,4)=");
				System.out.println(mathDemo1.mul(3, 4));
		
		System.out.println("\nMathDemo2\n");
			MathDemo2 mathDemo2 = new MathDemo2();
			System.out.println("INPUTS: A=3 B=4");
			
			System.out.print("Calling parent class: ");
				System.out.println(mathDemo2.add());
				
			System.out.print("Calling child class:");
				System.out.println(mathDemo1.add(3, 4));
				
			System.out.print("Sub(3,4)=");
				System.out.println(mathDemo2.sub(3, 4));
				
			System.out.print("Mul(3,4)=");
				System.out.println(mathDemo2.mul(3, 4));
				
			System.out.print("Div(3,4)=");
				System.out.println(mathDemo2.div(3, 4));
}
	
}
