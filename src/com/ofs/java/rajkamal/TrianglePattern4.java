/*****
 * 
 * 
 * Author : Rajkamal
 * 
 * 
 * 
 * ***/


package com.ofs.java.rajkamal;

public class TrianglePattern4 {
	public static void main(String[] args) {
		int n = 5, i = 0;
		// THIS DO WHILE TO PRINT NUMBER OF ROWS
		do {
			int k = 0;

			// THIS DO WHILE IS TO LEAVE A SPACE BEGINING IN A ROW
			do {
				System.out.print(" ");
				k++;

			} while (k <= i);
			int j = 0;
			// THIS DO WHILE IS FOR PRINTING THE STAR
			do {
				System.out.print("* ");
				j++;
			} while (j < n-i);
			System.out.println();
			i++;
		} while (i < n);
	}

}
