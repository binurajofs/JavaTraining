package com.ofs.java.day1;

public class TrianglePattern3 {

	public static void main(String[] args) {

		int k = 0;
		// While loop to indicate rows of triangle.
		while (k <= 4) {
			int j = 4;
			// Nested do while loop print * triangle.
			do {
				System.out.print("* ");
				j--;
			} while (j >= k);
			System.out.println(" ");
			k++;
		}

	}

}
