package com.ofs.java.rinosh;

public class TrianglePattern2 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 4;
			while (j >= i) {
				System.out.print(" ");
				j--;
			}
			int k = 1;
			while (k <= i) {
				System.out.print(" *");
				k++;
			}
			System.out.println("");
			i++;
		}
	}
}