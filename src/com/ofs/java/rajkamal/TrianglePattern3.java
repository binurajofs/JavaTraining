/*****
 * 
 * 
 * Author : Rajkamal
 * 
 * 
 * 
 * ***/


package com.ofs.java.rajkamal;

public class TrianglePattern3 {

	public static void main(String[] args) {
		int row = 4;
		do {
			int col = 0;
			// THIS DO WHILE IS FOR PRINTING EACH ROW
			do {
				System.out.print("*");
				col++;
			} while (col <= row);
			// THIS DO WILE IS FOR COLUMN
			System.out.println("");
			row--;
		} while (row>= 0);

	}
}
