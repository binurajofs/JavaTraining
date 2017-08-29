package com.ofs.java.swathi;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 5, i = 0;

		while (i < n) {

			int j = 0;
			while (j < n - i) {
				System.out.print(" ");
				j++;
			}

			int k = 0;
			while (k <= i) {
				System.out.print("* ");
				k++;
			}

			System.out.println();
			i++;
		}

	}
}
