package com.ofs.java.rinosh;

import java.util.Scanner;

public class SwitchDemo {
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
	}
}