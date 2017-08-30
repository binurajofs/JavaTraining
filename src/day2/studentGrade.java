package day2;

import java.util.Scanner;

public class studentGrade {

	public static void main(String[] args) {
		int quizscore, mid, fscore, avg;
		Scanner grade = new Scanner(System.in);
		System.out.println("Enter the Quiz Score");
		quizscore = grade.nextInt();
		System.out.println("Enter the Mid-Term Score");
		mid = grade.nextInt();
		System.out.println("Enter the Final-Score");
		fscore = grade.nextInt();
		avg = (quizscore + mid + fscore) / 3;
		if (avg >= 90) {
			System.out.println("Your Grade is A");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("Your Grade is B");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("Your Grade is C");
		} else if (avg < 50) {
			System.out.println("Your Grade is F");
		}

	}

}
