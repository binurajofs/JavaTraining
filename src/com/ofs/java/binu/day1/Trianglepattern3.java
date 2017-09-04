package com.ofs.java.binu.day1;

public class Trianglepattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5, j = 0;
		do {
			do {
				System.out.print("*");
				j++;
			} while (j < i);
			System.out.println("");
			i--;
			j = 0;
		} while (i >= 0);
	}

}
