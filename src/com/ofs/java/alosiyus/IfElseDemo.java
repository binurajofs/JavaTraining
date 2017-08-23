package com.ofs.java.alosiyus;

import java.util.*;
public class IfElseDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x, y, z;
		 float average;
		   Scanner input=new Scanner(System.in);
		   System.out.println("Enter your quiz score : ");
	   
	      x = input.nextInt();
	      System.out.println("Enter your midterm score : ");
	      y = input.nextInt();
	      System.out.println("Enter your final score : ");
	      z = input.nextInt();
	      average=(x+y+z)/3;
	      System.out.println("the average is = "+average);
	      if(average>=90)
	      
	    	  System.out.println("Grade=A");
	    	  
	    	  else if(average>=70&&average<=90) 
	    		  System.out.println("Grade: B");
	    	  
	      
	      else if(average>=50&&average<=70) 
    		  System.out.println("Grade: C");
    	  
	      else if(average<50) 
	      System.out.println("Grade: F");
	      input.close();
	      }
	      
}
