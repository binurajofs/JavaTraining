package com.ofs.java.alosiyus.day4;

public class DynamicLoadCLass {
	void printName(Object obj){  
		  Class c=obj.getClass();    
		  System.out.println(c.getName());  
		  }
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
	Class Classname=Class.forName("Simple");
	  System.out.println(Classname.getName());

	}

}
class Simple{}

	    