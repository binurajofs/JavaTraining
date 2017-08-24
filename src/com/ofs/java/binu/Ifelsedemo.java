package com.ofs.java.binu;

import java.util.Scanner;

public class Ifelsedemo {                              // creating class

	public static void main(String[] args) {           // main function
		// TODO Auto-generated method stub
		Scanner grade = new Scanner(System.in);          // creating object for scanner
		int quiz=0 ,midterm=0 ,finalmark=0 ;            // initializing the variables
		System.out.println("Enter the score of quiz");  // Getting the value
		quiz= grade.nextInt();             
		System.out.println("Enter the score of midterm");
		midterm= grade.nextInt();
		System.out.println("Enter the score of final");
		finalmark= grade.nextInt();
		float avg;                                      // defining average
		avg=(quiz+midterm+finalmark)/3;                // calculating average 
		if(avg>=90)                                   // condition to find grade 
		{
			System.out.println("Grade A");           // Printing the result grade
		}
		else if(avg>=70 && avg<90)
		{
			System.out.println("Grade B");		
		}
		else if(avg>=50 && avg<70)
		{
			System.out.println("Grade C");			
		}
		else if(avg<50)
		{
			System.out.println("Grade F");
		}
	}

}                                                    // program end
