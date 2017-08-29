package com.ofs.java.day4;

public class StringObject {

	public static void main(String[] args) {
		
	//create String objects with String literal
	String str="Raj kamal";
	//Using new keyword
	String str1= new String("Raj kamal");
	//Using character array 
	char ch[]={ 'R','a','j',' ','k','a','m','a','l'};
	String str2=new String(ch);
System.out.println(str);
System.out.println(str1);
System.out.println(str2);
 }
}
