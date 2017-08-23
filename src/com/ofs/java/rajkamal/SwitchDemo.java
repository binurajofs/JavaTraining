package com.ofs.java.rajkamal;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// GETTING INPUT FROM USER
		Scanner in = new Scanner(System.in);
		int quiz = 0, midterm = 0, finalScore = 0, average = 0;
		System.out.println("Type the quiz score");
		quiz = in.nextInt();
		System.out.println("Type the midterm score");
		midterm = in.nextInt();
		System.out.println("Type the final score");
		finalScore = in.nextInt();
		average = ((quiz + midterm + finalScore) / 3);
		int n;
		// CONDITION FOR CHECKING GRADE
		if (average >= 90) {
			n = 1;
		} else if (average >= 70 && average < 90) {
			n = 2;
		} else if (average >= 50 && average < 70) {
			n = 3;
		} else {
			n = 4;
		}
		// SWITCH CASE TO CHECK THE GRADE
		switch (n) {
		case 1:
			System.out.println("Grade A");
			break;
		case 2:
			System.out.println("Grade B");
			break;

		case 3:
			System.out.println("Grade C");
			break;
		case 4:
			System.out.println("Grade F");
			break;
		default:
			break;
		}

		in.close();

	}

}
