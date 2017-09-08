package com.ofs.java.vini.Day4;


public class StaticDynamic {
   public static void main(String[] args) {
 
      ClassLoader cl =StaticDynamic .class.getClassLoader();
 
      try {
         Class<?> c = cl.loadClass("MyClass");
         System.out.println("c.getName() = " + c.getName());
      } catch (Exception e) {
         System.out.println("Exception: " + e.toString());
      }
   }
}
 
 class MyClass {
	
}
 

