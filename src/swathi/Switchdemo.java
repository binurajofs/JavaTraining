package com.ofs.java.swathi;

import java.util.Scanner;

public class Switchdemo {
	public static void main(String[] args) {

		int quiz;
		int mid_term;
		int final_score;
		int avg;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter score for quiz:");
		quiz = input.nextInt();
		System.out.println("Enter score for mid term:");
		mid_term = input.nextInt();
		System.out.println("Enter score for final");
		final_score = input.nextInt();
		avg = (quiz + mid_term + final_score) / 3;
		int z = avg / 10;

		switch (z) {
		case 10:
			char grade = 'A';
			System.out.println("Your grade is " + grade);
			break;

		case 9:
			grade = 'A';
			System.out.println("Your grade is " + grade);
			break;

		case 8:
			grade = 'B';
			System.out.println("Your grade is " + grade);
			break;

		case 7:
			grade = 'B';
			System.out.println("Your grade is " + grade);
			break;

		case 6:
			grade = 'C';
			System.out.println("Your grade is " + grade);
			break;

		case 5:
			grade = 'C';
			System.out.println("Your grade is " + grade);
			break;

		default:
			grade = 'F';
			System.out.println("Your grade is " + grade);
			break;
		}
		input.close();
	}
}