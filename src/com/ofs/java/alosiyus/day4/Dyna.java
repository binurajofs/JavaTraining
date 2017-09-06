package com.ofs.java.alosiyus.day4;
class MyClass{
}

public class Dyna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader cl = Dyna.class.getClassLoader();
		 
	      try {
	         Class c = cl.loadClass("MyClass");
	         System.out.println("c.getName() = " + c.getName());
	      } catch (Exception e) {
	         System.out.println("Exception: " + e.toString());
	      }
	}

}
