package com.ofs.java.binu.day1;

import java.util.Scanner;

public class ifElsedemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Quiz score");
		int Q = sc.nextInt();
		System.out.println("Enter your mid-term score");
		int M = sc.nextInt();
		System.out.println("Enter the final mark");
		int F = sc.nextInt();
		System.out.println("Quiz Score: " + Q);
		System.out.println("Mid-trem Score:" + M);
		System.out.println("Final Score:" + F);

		int avg = ((Q + M + F) / 3);

		if (avg >= 90) {

			System.out.println("Grade= A");

		} else if (avg >= 70 && avg < 90) {
			System.out.println("Grade= B");

		} else if (avg >= 50 && avg < 70) {
			System.out.println("Grade= C");
		} else if (avg < 50) {

			System.out.println("Grades= F");
		}
	}

}
