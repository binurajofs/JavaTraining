<<<<<<< HEAD
package com.ofs.java.day2raj;
import com.ofs.java.day2raj.inheritance.MathDemo;
import com.ofs.java.day2raj.inheritance.MathDemo1;
import com.ofs.java.day2raj.inheritance.MathDemo2;
=======
package com.ofs.java.binu.day2raj;

import com.ofs.java.binu.day2raj.inheritance.MathDemo;
import com.ofs.java.binu.day2raj.inheritance.MathDemo1;
import com.ofs.java.binu.day2raj.inheritance.MathDemo2;
import com.ofs.java.binu.day2raj.inheritance.MethodDemo;
import com.ofs.java.binu.day2raj.inheritance.MethodOverLoadDemo;

/**
 * 
 * Day 2 task main class;
 * @author binurajk
 *
 */
>>>>>>> origin/rajkamal
public class Day2Demo {
public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		// call method one;
		methodDemo.addition(3,6);
		// call method two and print the return value;
		System.out.println(MethodDemo.addition(5,5,5));
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
	int res1=methodOverLoadDemo.calculateLHS(2,3,4);
	int res2=methodOverLoadDemo.calculateRHS(2,3,4);
	System.out.println("lhs of 3 Number ="+res1);
	System.out.println("rhs of 3 Number ="+res2);
	if(res1==res2)
	{
		System.out.println("rhs=lhs");
	}
	else {
		System.out.println("rhs!=lhs");
	}
	int res3=methodOverLoadDemo.calculateLHS(5,2);
	int res4=methodOverLoadDemo.calculateRHS(2,9);
	System.out.println("lhs="+res3);
	System.out.println("rhs="+res4);
	if(res3==res4)
	{
		System.out.println("Thus rhs=lhs");
	}
	else {
		System.out.println("Thus rhs!=lhs");
	}
	
	MathDemo mathDemo = new MathDemo();
		// call methods and print the result;

<<<<<<< HEAD
=======
	public static void main(String args[]) {
		
		MethodDemo methodDemo = new MethodDemo();
		// call method one;
		methodDemo.addition(3,6);
		// call method two and print the return value;
		System.out.println(MethodDemo.addition(5,5,5));
		
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
	int res1=methodOverLoadDemo.calculateLHS(2,3,4);
	int res2=methodOverLoadDemo.calculateRHS(2,3,4);
	System.out.println("lhs="+res1);
	System.out.println("rhs="+res2);
	if(res1==res2)
	{
		System.out.println("rhs=lhs");
	}
	else {
		System.out.println("rhs!=lhs");
	}
	int res3=methodOverLoadDemo.calculateLHS(2,3);
	int res4=methodOverLoadDemo.calculateRHS(2,3);
	System.out.println("lhs="+res3);
	System.out.println("rhs="+res4);
	if(res3==res4)
	{
		System.out.println("Thus rhs=lhs");
	}
	else {
		System.out.println("rhs!=lhs");
	}
	
	MathDemo mathDemo = new MathDemo();
		// call methods and print the result;

>>>>>>> origin/rajkamal
		System.out.println(MathDemo.add(5));
		MathDemo.addi();
		MathDemo.addi();
		
		MathDemo1 mathDemo1 = new MathDemo1();
		// call methods and print the result;
		mathDemo1.sub(4, 2);
		mathDemo1.mul(2,3);
		mathDemo1.add(4,3);
		MathDemo2 mathDemo2 = new MathDemo2();
         mathDemo2.div(10,5);
	}
<<<<<<< HEAD
=======


>>>>>>> origin/rajkamal
}



