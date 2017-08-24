package com.ofs.java.binu.day2;

public class MethodDemo {  // creating class

	// Create a method to add two number, and print here.
	public void add(int a, int b)  // creating method with two arguments
	{
		System.out.println("The add value is "+(a+b));
	}
	
	// Create a method to add two number, and return the result(use return type)
	public int add (int a, int b, int c) // creating method with three arguments
	{
		return (a+b+c);                 // returning the arguments after adding them
	} 
}                                      // end program