package com.ofs.java.rinosh;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int quiz;
		int mid_term;
		int finals;

		System.out.println("Enter quiz mark: ");
		quiz = sc.nextInt();
		System.out.println("Enter mid-term mark: ");
		mid_term = sc.nextInt();
		System.out.println("Enter finals mark: ");
		finals = sc.nextInt();

		int avg = (quiz + mid_term + finals) / 3;

		if (avg >= 90) {
			char grade = 'A';
			System.out.println("Your grade is " + grade);
		} else if (avg >= 70 && avg < 90) {
			char grade = 'B';
			System.out.println("Your grade is " + grade);
		} else if (avg >= 50 && avg < 70) {
			char grade = 'C';
			System.out.println("Your grade is " + grade);
		} else if (avg < 50) {
			char grade = 'F';
			System.out.println("Your grade is " + grade);
		}
	}
}