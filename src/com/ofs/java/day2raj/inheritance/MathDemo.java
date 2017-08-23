package com.ofs.java.binu.day2raj.inheritance;

public class MathDemo {
		// add the demo_number with every return and increment it;
		// understand the static usage;
		
		private static int demo_number = 1;

		// create method add ; Just print a statement;
		public static int add(int x) {
			int res=x+demo_number;
	       return res;
	       
		}
		public static void addi()
		{
			System.out.println("demonum is :"+demo_number);
			demo_number++;
			
		}
	
	
	
}