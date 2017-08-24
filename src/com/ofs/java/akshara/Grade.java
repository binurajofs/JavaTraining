package com.ofs.java.akshara;
import java.util.Scanner;  
public class Grade {
	public static void main(String args[]){  
		   Scanner sc=new Scanner(System.in); 
		   int quiz,midterm,finals;
		   System.out.println("Quiz:");
		   quiz=sc.nextInt();
		   System.out.println("Mid-Term:");
		   midterm=sc.nextInt();
		   System.out.println("Final:");
		   finals=sc.nextInt();
		   int avg=(quiz+midterm+finals)/3;
		   if(avg>=90)
			   System.out.println("Grade A");
		   else if(avg>=70 && avg<90)
			   System.out.println("Grade B");
		   else if(avg>=50 && avg<70)
			   System.out.println("Grade C");
		   else
			   System.out.println("Grade F"); 
		   

}
}