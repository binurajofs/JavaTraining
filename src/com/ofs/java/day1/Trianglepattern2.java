package com.ofs.java.day1;

public class Trianglepattern2 {
	public static void main(String args[]) {
		Design design = new Design();
		design.layout();
	}
}

class Design {
	int k, rows = 6;
	int i = 1;

	// Defining layout method.
	void layout() {
		// While loop for iterating rows.
		while (i <= rows) {
			k = 0;
			// Here for loop to print spaces of left triangle.
			for (int space = 1; space <= (rows - i); space++) {
				System.out.print(" ");
			}
			// Here while loop to print * triangle after spaces.
			while (k != i - 1) {
				System.out.print("* ");
				k++;
			}
			// New line after each row printed.
			System.out.println();
			i++;
		}
	}
}
