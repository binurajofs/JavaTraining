package com.ofs.java.swathi;

import java.util.Scanner;
public class studentGrade1 {
	public static void main(String[] args){
		int quiz;
		int mid_term;
		int final_score;
		float avg;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter score for quiz:");
		quiz=input.nextInt();
		System.out.println("Enter score for mid term:");
		mid_term=input.nextInt();
		System.out.println("Enter score for final");
		final_score=input.nextInt();
		avg=(quiz+mid_term+final_score)/3;
		if (avg>=90){
			 System.out.println("Your grade is:A");
		}
		else if(avg>=70 && avg< 90){
			System.out.println("Your grade is:B");
		}
		else if(avg>=50 && avg< 70){
			System.out.println("Your grade is:C");
		}
		else if (avg<50){
			System.out.println("Your grade is:F");
		}
	input.close();
	}


}
