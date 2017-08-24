package com.ofs.java.binu;

import java.util.Scanner;

public class Switchdemo {                              // new class
	
	public static void main(String[] args) {           // main function
		// TODO Auto-generated method stub
		Scanner grade = new Scanner(System.in);        //creating object for scanner
		int quiz=0 ,midterm=0 ,finalmark=0 ;
		System.out.println("Enter the score of quiz");
		quiz= grade.nextInt();
		System.out.println("Enter the score of midterm");
		midterm= grade.nextInt();
		System.out.println("Enter the score of final");
		finalmark= grade.nextInt();
		float avg;                                     // declaring variable avg(average)
		avg=(quiz+midterm+finalmark)/3;                // calculating average
		int x = 0;	                                   // initializing variable x
		if(avg>=90)                                    // condition to find grade 
		{
			x=1;
		}
		else if(avg>=70 && avg<90)
		{
			x=2;		
		}
		else if(avg>=50 && avg<70)
		{
			x=3;			
		}
		else if(avg<50)
		{
			x=4;
		}
		
		switch(x)                                     // switching the variable x
		{
		case 1:                                       // switch cases starts
		{
		    	System.out.println("Grade A");        // condition true means prints grade
		    	break;
		}
		
		case 2:
		{
		    	System.out.println("Grade B");
		    	break;
		}
		case 3:
		{
		    	System.out.println("Grade C");
		    	break;
		}
		case 4:
		{
		    	System.out.println("Grade F");
		}


	}

}

}                                                     // program end