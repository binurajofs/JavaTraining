package com.ofs.java.day1;

public class TrianglePattern4 {
	public static void main(String[] args) {
		int n = 5, i = 0;
		// First do while loop to define rows of triangle.
		do {
			int k = 0;
			do {
				System.out.print(" ");
				k++;
				// Here while condition for white spaces.
			} while (k <= i);

			int j = 0;
			do {
				// Do statement to print * triangle.
				System.out.print("* ");
				j++;
			} while (j < n - i);
			// While statement for printing * in rows.
			System.out.println();
			i++;
			// While condition for rows.
		} while (i < n);
	}
}