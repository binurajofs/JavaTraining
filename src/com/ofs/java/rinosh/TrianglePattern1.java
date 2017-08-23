package com.ofs.java.rinosh;

public class TrianglePattern1 {
	public static void main(String[] args) {
		int j = 1;
		while (j <= 5) {
			int i = 0;
			while (i < j) {
				System.out.print(" * ");
				i++;
			}
			System.out.println();
			j++;
		}
	}
}