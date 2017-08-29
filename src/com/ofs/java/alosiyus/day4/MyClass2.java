package com.ofs.java.alosiyus.day4;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String firstname="Alosiyus";
     String lastname="Joseph";
     String name = lastname + " " + firstname; 
     System.out.println(name);
        	
        	
     StringBuilder sb = new StringBuilder(14);
     sb.append(lastname).append(" ").append(firstname);
     System.out.println(sb.toString());
     
  	
     StringBuffer sBuffer = new StringBuffer(15);
  sBuffer.append(lastname).append(" ").append(firstname);
  System.out.println(sBuffer.toString());
	
	String c=firstname.concat(lastname);
	System.out.println(c);
	}

}
