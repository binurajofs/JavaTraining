package com.ofs.java.day1;

public class Trianglepattern6 {
	static int i, j, k, m, p;

	public static void main(String[] args) {
		// Here for loop for printing first line.
		for (i = 0; i < 9; i++) {
			System.out.print("* ");
		}
		System.out.println(" ");
		// For loop for remaining four rows.
		for (k = 4; k > 0; k--) {
			// For loop to print left side inverted * triangle.
			for (j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			// For loop to print Triangle with spaces.
			for (p = 4; p >= (2 * k - 4); p--) {
				System.out.print("  ");
			}
			// Final for loop for right side inverted * triangle.
			for (m = 1; m <= k; m++) {
				System.out.print("* ");
			}
			System.out.println(" ");

		}
	}
}
