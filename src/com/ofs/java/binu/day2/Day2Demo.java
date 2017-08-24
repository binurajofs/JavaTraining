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
		
		System.out.println("The output for MethodDemo");
		MethodDemo methodDemo = new MethodDemo();  // creating object
		// call method one;
		
		methodDemo.add(10,20);                     // passing values to arguments
		// call method two and print the return value;
	    System.out.println("The add value "+methodDemo.add(10, 20, 30)); // passing values
		
	    
		
		System.out.println("");
	    System.out.println("The output for MethodOverLoaDemo: ");
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		// check LHS=RHS with if condition
		
		if(methodOverLoadDemo.calculateLHS(5,4,2)==methodOverLoadDemo.calculateRHS(5,4,2))
		{                                    // printing the result          
			System.out.println("LHS(1)=RHS(1)");
		}
		else
		{
			System.out.println("Not Equal");		
		}
		
		// check LHS=RHS with if condition
		if(methodOverLoadDemo.calculateLHS(5,6)==methodOverLoadDemo.calculateRHS(5,6))
		{                                     // printing the result
			System.out.println("LHS(2)=RHS(2)");
		}
		else
		{
			System.out.println("Not Equal");		
		}
		
		
		
		
		System.out.println("");
		System.out.println("The output for MathDemo:");
		MathDemo mathDemo = new MathDemo();       // creating object
		// call methods and print the result;
		MathDemo.demoNumber();
		mathDemo.add();
		
		
		
		System.out.println("");
		System.out.println("The output for MathDemo1:");
		MathDemo1 mathDemo1 = new MathDemo1();   // creating object
		// call methods and print the result;
		// passing values to the arguments;
		System.out.println("The multiplicated value is "+ mathDemo1.mul(10, 5));
		System.out.println("The subtracted value is "+ mathDemo1.sub(10, 5));
		System.out.println("The added value is "+ mathDemo1.add(10, 5));
		
		
		
		System.out.println("");
		System.out.println("The output for MathDemo2:");
		MathDemo2 mathDemo2 = new MathDemo2();  // creating object
        mathDemo2.div(4, 2);                    // passing values to arguments
	}
}
