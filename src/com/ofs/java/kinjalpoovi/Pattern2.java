package com.ofs.java.kinjalpoovi;

public class Pattern2 {

	public static void main(String[] args) {
		int row = 6;
		int n = row;
		int j = 0;
		while (j < row) {
			int i = 0;
			int k = 0;
			while (n > k) {
				System.out.print(" ");
				k++;
			}
			while (i < j) {

				System.out.print("* ");
				i++;
			}
			System.out.println();
			j++;
			n--;
		}

	}

}
