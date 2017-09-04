package com.ofs.java.day1;

//Importing scanner class for getting input values.
import java.util.Scanner;

public class IfElseDemo {

	int sum = 0, average = 0, number = 0;
	int getInput[] = new int[5];

	void calculateGrade() {

		int average = getMarks();
		// average = avg (a,b,c);
		if (average != 0) {
			System.out.println("Average marks is " + average + "\n");
			defineGrade(average);
		} else {
			System.out.println("Limit exceeded");
		}
	}

	// get marks input from user.
	int getMarks() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many subjects (max=5): ");
		number = scanner.nextInt();

		if (number < 6) {
			for (int i = 0; i < number; i++) {
				System.out.println("Enter marks : ");
				getInput[i] = scanner.nextInt();
			}
			for (int i = 0; i < number; i++) {
				sum = sum + getInput[i];
			}
			average = sum / number;
			scanner.close();
			return average;
		} else {
			scanner.close();
			return average;
		}
	}

	// If else laffer to print the grade of given marks.
	void defineGrade(int average) {

		if (average >= 90) {
			System.out.println("Grade is A");
		} else if (average >= 70 && average < 90) {
			System.out.println("Grade is B");
		} else if (average >= 50 && average < 70) {
			System.out.println("Grade is C");
		} else {
			System.out.println("Grade is F");
		}

	}

	// Ecexuting the if else demo object and calculateGrade method.
	public static void main(String args[]) {

		IfElseDemo demo = new IfElseDemo();
		demo.calculateGrade();
	}
}
