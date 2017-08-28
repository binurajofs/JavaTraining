package com.ofs.java.saravana.day2.inheritance;

public class MathDemo {
	
	// add the demo_number with every return and incretement it;
	// understand the static usage;
	private static int demo_number = 1;
public  int add() {
	int a=10,b=20;
	int c=a+b;
        System.out.println("additional number is: "+c);	
        return 0;
}
public static int add1()
{
	return demo_number++;
}
	// create method add ; Just print a statement;
}
