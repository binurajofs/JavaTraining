/*****
 * 
 * 
 * Author : Rajkamal
 * 
 * 
 * 
 * ***/


package com.ofs.java.rajkamal;

public class TrianglePattern1 {
	public static void main(String[] args) {
		int j = 1;
		// THIS WHILE LOOP IS FOR ROWS
		while (j <= 5) {
			int i = 0;
			// THIS WHILE LOOP IS FOR COLUMN
			while (i < j) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			j++;
		}
	}

}
