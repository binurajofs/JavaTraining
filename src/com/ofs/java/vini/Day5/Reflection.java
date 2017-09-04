package com.ofs.java.vini.Day5;

public class Reflection {
		private int number= 10;
		public String name="vinitha";
		protected double value=2.2;
		
		public void display(Reflection baseClass) {
			System.out.println("----Before Reflection----");
			System.out.println("Number is "+baseClass.number);
			System.out.println("Name is "+baseClass.name);
			System.out.println("Value is"+baseClass.value);
	}
	}
