package com.ofs.java.rinosh;

public class TrianglePattern6 {

	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.print(" * ");
			}
			for (int k = 1; k < j; k++) {
				System.out.print("   ");
			}
			for (int k = 1; k < j; k++) {
				System.out.print("   ");
			}
			for (int k = 5; k >= j; k--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}