package com.ofs.java.swathi;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" * ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("   ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
			n = n + 2;
		}

	}
}
