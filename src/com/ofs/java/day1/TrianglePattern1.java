package com.ofs.java.day1;

public class TrianglePattern1 {
	public static void main(String[] args) {
		int i = 1;

		// Intitial while loop for rows of triangle.
		while (i <= 5) {
			int j = 1;

			// Nested while loop to print * in rows.
			while (j <= i) {
				System.out.print("* ");
				j++;
			}

			// New line after each row.
			System.out.println();
			i++;
		}

	}

}
