package com.ofs.java.day1;

public class TrianglePattern5 {
	public static void main(String[] args) {

		int i, j, k, m, p, q;

		// First for loop for indicating rows.

		for (i = 1; i <= 4; i++) {
			// For loop for left side * triangle.
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			// For loop for printing white space triangle.
			for (k = 5; k > i; k--) {
				System.out.print("  ");
			}
			// For loop to print right side * triangle.
			for (p = 5; p > (i + 1); p--) {
				System.out.print("  ");
			}
			// For loop to print right side * triangle.
			for (m = 1; m <= i; m++) {
				System.out.print("* ");
			}

			System.out.println(" ");
		}
		// Finally for loop to print last line with stars.
		for (q = 1; q <= 9; q++) {

			System.out.print("* ");
		}

	}
}
