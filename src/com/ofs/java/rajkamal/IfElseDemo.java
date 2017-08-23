package com.ofs.java.rajkamal;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int quiz = 0, midterm = 0, finalScore = 0, average = 0;
		System.out.println("Type the quiz score");
		quiz = in.nextInt();
		System.out.println("Type the midterm score");
		midterm = in.nextInt();
		System.out.println("Type the final score");
		finalScore = in.nextInt();
		average = ((quiz + midterm + finalScore) / 3);
		if (average >= 90) {
			System.out.println("Grade A");
		} else if (average >= 70 && average < 90) {
			System.out.println("Grade B");
		} else if (average >= 50 && average < 70) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade F");
		}
		in.close();

	}

}
