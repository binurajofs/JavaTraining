package com.ofs.java.akshara;

import java.util.Scanner;

public class Gradeswitch {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		   int quiz,midterm,finals;
		   System.out.println("Quiz:");
		   quiz=sc.nextInt();
		   System.out.println("Mid-Term:");
		   midterm=sc.nextInt();
		   System.out.println("Final:");
		   finals=sc.nextInt();
		   int avg=(quiz+midterm+finals)/3;
		   int mark=avg/10;
		   switch(mark)
		   {
		   case 10:
			   System.out.println("Grade A");
			   break;
		   case 9:   
			   System.out.println("Grade A");
			   break;
		   case 8:
			   System.out.println("Grade B");
			   break;
		   case 7:
			   System.out.println("Grade B");
			   break;
		   case 6:
			   System.out.println("Grade C");
			   break;
		   case 5:
			   System.out.println("Grade C");
			   break;
			default:
				 System.out.println("Grade F");
		   }

	}

}
