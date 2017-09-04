package com.ofs.java.binu.day1;

public class Trianglepattern6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n = 5;
		for (i = 1; i <= n; i++) {
			int j = 0;
			for (j = i; j <= n; j++) {
				System.out.print("*");
			}
			for (j = 1; j <= ((2 * i) - 2); j++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}