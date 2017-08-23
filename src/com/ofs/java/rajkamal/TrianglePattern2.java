/*****
 * 
 * 
 * Author : Rajkamal
 * 
 * 
 * 
 * ***/

package com.ofs.java.rajkamal;

public class TrianglePattern2 {
	public static void main(String[] args) {
		int i = 1;
		// THIS WHILE LOOP IS FOR ROWS
		while (i <= 5) {
			int j = 4, k = 1;
			// THIS WHILE LOOP IS FOR LEAVING SPACE IN BEGINNIG
			while (j >= i) {
				System.out.print(" ");
				j--;
			}
			// THIS WHILE LOOP IS FOR PRINTING * IN COLUMN
			while (k <= (2 * i - 1)) {
				System.out.print("*");
				k++;
			}
			// THIS ID TO PRINT IN NEXT LINE
			System.out.println("");
			i++;
		}
	}
}
		/*
		 * 
		 * int i=5,n=0; // THIS DO WHILE TO PRINT NUMBER OF ROWS do { int k = 5;
		 * 
		 * // THIS DO WHILE IS TO LEAVE A SPACE BEGINING IN A ROW do {
		 * System.out.print(" "); k--;
		 * 
		 * } while (k >= i); int j = 5; // THIS DO WHILE IS FOR PRINTING THE STAR do {
		 * System.out.print("* "); j--; } while (j > n-i); System.out.println(); i--; }
		 * while (i > n);
		 */