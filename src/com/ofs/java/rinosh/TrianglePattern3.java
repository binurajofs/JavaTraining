package com.ofs.java.rinosh;

public class TrianglePattern3 {
	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 5;
			do {
				System.out.print(" * ");
				j--;
			} while (i <= j);
			System.out.println();
			i++;
		} while (i <= 5);
	}
}