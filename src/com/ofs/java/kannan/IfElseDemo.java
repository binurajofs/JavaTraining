package com.ofs.java.kannan;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int quiz=0,midterm=0,final_score=0,average=0;
		System.out.println("Enter quiz score");
		quiz=in.nextInt();
		System.out.println("Enter midterm score");
		midterm=in.nextInt();
		System.out.println("Enter final score");
		final_score=in.nextInt();
		average=((quiz+midterm+final_score)/3);
		if(average>=90) {
			System.out.println("Grade A");
		}
		else if(average>=70 && average<90) {
			System.out.println("Grade B");
		}
		else if(average>=50 && average<70) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}
		in.close();
		////

	}

}
