package com.ofs.java.hamsa;

public class pattern1 {

	public static void main(String[] args) {
		int i, j;
		i = 1;

		while (i <= 5) {
			System.out.print("");
			j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
