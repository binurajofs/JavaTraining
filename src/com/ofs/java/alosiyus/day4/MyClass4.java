package com.ofs.java.alosiyus.day4;


public class MyClass4 {
	   public static void main(String[] args) {
	 
	      ClassLoader cl = MyClass4.class.getClassLoader();
	 
	      try {
	         Class c = cl.loadClass("MyClass");
	         System.out.println("c.getName() = " + c.getName());
	      } catch (Exception e) {
	         System.out.println("Exception: " + e.toString());
	      }
	   }
	}
