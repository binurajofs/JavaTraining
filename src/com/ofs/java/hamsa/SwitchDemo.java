package com.ofs.java.hamsa;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String args[]) {

		int quiz, mid_term, finals;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quiz score:");
		quiz = sc.nextInt();
		System.out.println("Mid-term score:");
		mid_term = sc.nextInt();
		System.out.println("Final score:");
		finals = sc.nextInt();
		sc.close();
		int avg = (quiz + mid_term + finals) / 3;

		switch (avg / 10) {

		case 10:

			System.out.println("Your grade is A");
			break;

		case 9:

			System.out.println("Your grade is A");
			break;

		case 8:

			System.out.println("Your grade is B");
			break;

		case 7:

			System.out.println("Your grade is B");
			break;

		case 6:

			System.out.println("Your grade is C");
			break;

		case 5:

			System.out.println("Your grade is C");
			break;

		default:

			System.out.println("Your grade is F");
			break;
		}
	}

}
