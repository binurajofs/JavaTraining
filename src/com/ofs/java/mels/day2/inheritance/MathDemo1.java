package com.ofs.java.mels.day2.inheritance;

public class MathDemo1 extends MathDemo {
	// create methods to do sub, mul and define it.
	// define add method 
	/**
	 * sub() with 2 inputs
	 * 
	 * */
public int sub(int a,int b) {

		
		int c=a-b;
	
		return c;
	}
/**
 * mul() with 2 inputs
 * 
 * */
public int mul(int a,int b) {
	
		
	int c=a*b;
	
	return c;
	}
/**
 * add() with 2 inputs in child class
 * 
 * */
public int add(int a ,int b) {

		
	int c=a+b;
	return c;
	}
}
