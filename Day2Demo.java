 package com.ofs.java.binu.day2; 

/* import com.ofs.java.binu.day2.inheritance.MathDemo;
import com.ofs.java.binu.day2.inheritance.MathDemo1;
import com.ofs.java.binu.day2.inheritance.MathDemo2; */

import inheritance.MathDemo;
import inheritance.MathDemo1;
import inheritance.MathDemo2;
import inheritance.MethodDemo;
import inheritance.MethodOverLoadDemo;

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
		methodDemo.addition(10,20);
		// call method two and print the return value;
		System.out.println(methodDemo.additionReturn(20,30));
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		// impliments method overloading 
		//expression: ac+bc=c(a+b)
		
		System.out.println("a=2");
		System.out.println("b=3");
		System.out.println("c=4");
		System.out.println("Expression:ac+bc=c(a+b)");
		
		//prints LHS of ac+bc=c(a+b)
		
		System.out.println("LHS : " + methodOverLoadDemo.calculateLHS(2,3,4));
		
		//prints RHS of ac+bc=c(a+b)
		
		System.out.println("RHS : " + methodOverLoadDemo.calculateRHS(2,3,4));
	
		//COmparing RHS and LHS 
		// If equal will print matching else prints not matching
		
		if(methodOverLoadDemo.calculateLHS(2,3,4)==methodOverLoadDemo.calculateRHS(2,3,4)){
			System.out.println("matching");
		}
		else{
			System.out.println("not matching");
		}
		
		//expression: a3+b3=(a+b)*(a2-ab+b2)
		System.out.println("a=2");
		System.out.println("b=3");
		System.out.println("Expression:a3+b3=(a+b)(a2-ab+b2)");
		
		//prints LHS of a3+b3=(a+b)(a2-ab+b2)
		
		System.out.println("LHS : " + methodOverLoadDemo.calculateLHS(2,3));
		
		//prints RHS of a3+b3=(a+b)*(a2-ab+b2)
		
		System.out.println("RHS : " + methodOverLoadDemo.calculateRHS(2,3));
		
		//COmparing RHS and LHS 
		// If equal will print matching else prints not matching
		
		if(methodOverLoadDemo.calculateLHS(2,3)==methodOverLoadDemo.calculateRHS(2,3)){
			System.out.println("matching");
		}
		else{
			System.out.println("not matching");
		}
		
		
		MathDemo mathDemo = new MathDemo();
		// call methods and print the result;
		//for object mathDemo
		mathDemo.demoNumberCheck();
		mathDemo.demoNumberCheck();
		mathDemo.add();//with object mathDemo
		//For object mathDemo1
		MathDemo1 mathDemo1 = new MathDemo1();
		// call methods and print the result;
		mathDemo1.add();//with object mathDemo1
		System.out.println("Value_a:6 and value_b :3 ");
		System.out.println("Sum = " + mathDemo1.add(6,3));
		System.out.println("Difference = " + mathDemo1.sub(6,3));
		System.out.println("Product = " + mathDemo1.mul(6,3));
		System.out.println("quotient = " + mathDemo1.div(6,3));
		MathDemo2 mathDemo2 = new MathDemo2();
		// object mathDemo2
		mathDemo2.add();
		System.out.println("Value_a:10 and value_b :2 ");
		System.out.println("Sum = " + mathDemo2.add(10,2));
		System.out.println("Difference = " + mathDemo2.sub(10,2));
		System.out.println("Product = " + mathDemo2.mul(10,2));
		System.out.println("quotient = " + mathDemo2.div(10,2));
	}
}
