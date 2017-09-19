package com.ofs.java.navin.reflection;

public class BaseClass {
	private int number = 10;
	public String name="Navin";
	protected double value=2.2;
	private void baseClassPrivateMethod() {
		System.out.println(" ");
		System.out.println("I am Private Method");
	}
	
	public void display(BaseClass baseClass) {
		System.out.println("......Before Reflection......");
		System.out.println("Number is "+baseClass.number);
		System.out.println("Nmae is "+baseClass.name);
		System.out.println("Value is "+ baseClass.value);
	}

}
