package com.ofs.java.hamsa;

public class pattern6 {

	public static void main(String[] args) {

		int i, j, k;
		i = 5;
		j = 1;
		k = 1;

		for (j = 1; j <= 5; j++) {
			for (i = 5; i >= j; i--) {
				System.out.print(" * ");
			}
			for (k = 1; k < j; k++) {
				System.out.print("   ");
			}
			for (k = 1; k < j; k++) {
				System.out.print("   ");
			}
			for (k = 5; k >= j; k--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
