package com.ofs.java.binu.day1;

public class TrainglePattern1 {

	public static void main(String[] args) {

		int i = 1, j = 0;
		while (i <= 5) {
			while (j < i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
			j = 0;
		}
	}
}
