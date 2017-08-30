package com.ofs.java.kinjalpoovi;

public class Trianglepattern4 {

	public static void main(String[] args) {

		int n = 5, i = 0;
		do {
			int k = 0;
			do {
				System.out.print(" ");
				k++;
			} while (k <= i);
			int j = 0;
			do {
				System.out.print("* ");
				j++;
			} while (j < n - i);
			System.out.println();
			i++;
		} while (i < n);
	}
}
