package com.ofs.java.day4;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstName="Raj";
String lastName="kamal";

//1st Way using + Operator to Cancat
String name=firstName+" "+lastName;
	System.out.println(name);

	
	//2nd Way - By using StringBuilder
	StringBuilder sb=new StringBuilder(14);
	sb.append(firstName).append(" ").append(lastName);
	System.out.println(sb.toString());
	
	//3rd way - By Using StringBuffer
	StringBuffer sBuffer = new StringBuffer(15);	
	sBuffer.append(firstName).append(" ").append(lastName);
	System.out.println(sBuffer.toString());	

	//4th Way - By Using Concat Method
	String c = firstName.concat(lastName);
    System.out.println(c);
	}

}
