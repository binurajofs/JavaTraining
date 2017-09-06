package com.ofs.java.day4;

 class MyClass {
	 
}
 
public class DynamicLoading {
   public static void main(String[] args) {
 
      ClassLoader cl = DynamicLoading.class.getClassLoader();
 
      try {
         Class c = cl.loadClass("MyClass");
         System.out.println("c.getName() = " + c.getName());
      } catch (Exception e) {
         System.out.println("Exception: " + e.toString());
      }
   }
}