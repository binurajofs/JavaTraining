package com.ofs.java.alosiyus;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		 float average;
		   Scanner input=new Scanner(System.in);
		   System.out.println("Enter your quiz score : ");
	   
	      x = input.nextInt();
	      System.out.println("Enter your midterm score : ");
	      y = input.nextInt();
	      System.out.println("Enter your final score : ");
	      z = input.nextInt();
	      average=(x+y+z)/3;
	      System.out.println("the average is = "+average);
	      int n;
			// CONDITION FOR CHECKING GRADE
			if (average >= 90) {
				n = 1;
			} else if (average >= 70 && average < 90) {
				n = 2;
			} else if (average >= 50 && average < 70) {
				n = 3;
			} else {
				n = 4;
			}
			// switch case to check the grade based on average
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

			input.close();
	      
	}

}
