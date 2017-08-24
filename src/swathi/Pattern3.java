package com.ofs.java.swathi;

public class Pattern3 {
	public static void main(String[] args) {

		int i = 4;
		do {

			int j = 0;
			do {
				System.out.print("* ");
				j++;
			} while (j <= i);

			System.out.println("");
			i--;
		} while (i >= 0);

	}

}
