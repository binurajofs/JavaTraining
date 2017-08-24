package com.ofs.java.hamsa;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		yourGrade();
	}

	static void yourGrade() {
		int quizScore, midtermScore, finalScore, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quiz score:");
		quizScore = sc.nextInt();

		System.out.print("Mid-term score:");
		midtermScore = sc.nextInt();

		System.out.print("Final score:");
		finalScore = sc.nextInt();

		avg = (quizScore + midtermScore + finalScore) / 3;
		sc.close();

		if (avg >= 90)
			System.out.println("Your grade A.");
		else if ((avg >= 70) && (avg < 90))
			System.out.println("Your grade B.");
		else if ((avg >= 50) && (avg < 70))
			System.out.println("Your grade C.");
		else if ((avg < 50))
			System.out.println("your grade F.");
		else
			System.out.println("invalid");

	}

}
