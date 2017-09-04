package com.ofs.java.day1;

//Scanner class is imported.
import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// Marks input from user.
		Scanner in = new Scanner(System.in);

		int quiz = 0, midterm = 0, finalScore = 0, average = 0;

		System.out.println("Type the quiz score");
		quiz = in.nextInt();

		System.out.println("Type the midterm score");
		midterm = in.nextInt();

		System.out.println("Type the final score");
		finalScore = in.nextInt();

		// calculating average of marks.
		average = ((quiz + midterm + finalScore) / 3);

		int n;
		// Checking the condition for average6 interval..
		if (average >= 90) {
			n = 1;
		} else if (average >= 70 && average < 90) {
			n = 2;
		} else if (average >= 50 && average < 70) {
			n = 3;
		} else {
			n = 4;
		}
		// Switch case to check and print grade
		switch (n) {
		case 1:
			System.out.println("grade A");
			break;
		case 2:
			System.out.println("grade B");
			break;

		case 3:
			System.out.println("grade C");
			break;
		case 4:
			System.out.println("grade F");
			break;
		default:
			break;
		}

		in.close();

	}

}