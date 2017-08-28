package com.ofs.java.kinjalpoovi;

import java.util.Scanner;

public class studentgradeSwitch {

	public static void main(String[] args) {
		int quizscore, mid, fscore, avg, avg1;
		Scanner grade = new Scanner(System.in);
		System.out.println("Enter the Quiz Score");
		quizscore = grade.nextInt();
		System.out.println("Enter the Mid-Term Score");
		mid = grade.nextInt();
		System.out.println("Enter the Final-Score");
		fscore = grade.nextInt();
		avg = (quizscore + mid + fscore) / 3;
		switch (avg / 10) {
		case 9:
			System.out.println("Your Grade is A");
			break;
		case 8:
			System.out.println("Your Grade is B");
			break;
		case 7:
			System.out.println("Your Grade is B");
			break;
		case 6:
			System.out.println("Your Grade is C");
			break;
		case 5:
			System.out.println("Your Grade is C");
			break;
		default:
			System.out.println("Your Grade is F");

			break;
		}
	}

}
