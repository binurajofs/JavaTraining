package com.ofs.java.mels.day2.inheritance;

public class MathDemo {
	
	// add the demo_number with every return and increment it;
	// understand the static usage;
	
	private static int demo_number = 1;
	/**
	 * Static is incremented 
	 * 
	 * */
	
	// create method add ; Just print a statement;
	public String add() {
		
			
		demo_number++;
		return ("Static Demo number="+demo_number);
	}
}
