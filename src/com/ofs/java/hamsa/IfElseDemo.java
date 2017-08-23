package com.ofs.java.hamsa;
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		yourGrade();
	}

	static void yourGrade() {
		int quiz_score, midterm_score, final_score, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quiz score:");
		quiz_score = sc.nextInt();
		
		System.out.print("Mid-term score:");
		midterm_score = sc.nextInt();
		
		System.out.print("Final score:");
		final_score = sc.nextInt();
		
		avg = (quiz_score + midterm_score + final_score) / 3;
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
