package com.ofs.java.somu;

import java.util.Scanner;

public class Switchdemo {
	
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
		int x = 0;	
		if(avg>=90)
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
		
		switch(x)
		{
		case 1:
		{
		    	System.out.println("Grade A");
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

}