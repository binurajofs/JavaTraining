package com.ofs.java.binu.day1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Quiz marks");
		int Q = sc.nextInt();
		System.out.println("Enter the Mid score value");
		int M = sc.nextInt();
		System.out.println("Enter the Final score");
		int F = sc.nextInt();
		int avg = (Q + M + F) / 3;
		System.out.println("Quiz Score: " + Q);
		System.out.println("Mid-trem Score:" + M);
		System.out.println("Final Score:" + F);
		int n = avg / 10;
		switch (n) {
		case 5:
			System.out.println("your Grade is C");
			break;
		case 6:
			System.out.println(" your Grade is C");
			break;
		case 7:
			System.out.println("your Grade is B");
			break;
		case 8:
			System.out.println("your Grade is B");
			break;
		case 9:
			System.out.println("your Grade is A");
			break;
		default:
			System.out.println("your Grade is F");
			break;
		}

	}

}
