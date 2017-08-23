package com.ofs.java.somu;

import java.util.Scanner;

public class Ifelsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner grade = new Scanner(System.in);
		int quiz=0 ,midterm=0 ,finalmark=0 ;
		System.out.println("Enter the score of quiz");
		quiz= grade.nextInt();
		System.out.println("Enter the score of midterm");
		midterm= grade.nextInt();
		System.out.println("Enter the score of final");
		finalmark= grade.nextInt();
		float avg;
		avg=(quiz+midterm+finalmark)/3;
		if(avg>=90)
		{
			System.out.println("Grade A");
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

}
