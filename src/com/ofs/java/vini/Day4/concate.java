package com.ofs.java.vini.Day4;

public class concate 
{
	public static void main(String args[]) 
	{
		String firstname = "Vinitha";
		String lastname = "Ramesh";
		
		// Using + operator to concatenate String
		String name = firstname + " " + lastname;
		System.out.println(name);
		
		// by using StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(firstname).append(" ").append(lastname);
		System.out.println(sb.toString());
		
		// by using StringBuffer
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(firstname).append(" ").append(lastname);
		System.out.println(sBuffer.toString());
	}
}
	

