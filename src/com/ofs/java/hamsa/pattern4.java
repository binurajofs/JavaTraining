package com.ofs.java.hamsa;

public class pattern4 {
	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(" ");
				j++;
			} while (j <= i);
			int k = 5;
			do {
				System.out.print("* ");
				k--;
			} while (k >= i);
			System.out.println("");
			i++;

		} while (i <= 5);
	}
}
