package com.ofs.java.binu.day1;

public class Trianglepattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 4, k = 1;
		while (i <= 5) {
			while (j >= i) {
				System.out.print(" ");
				j--;
			}
			j = 4;
			while (k <= (2 * i - 1)) {
				System.out.print("*");
				k++;
			}
			k = 1;
			System.out.println("");
			i++;
		}
	}

}
