package com.ofs.java.rinosh.day4;

public class Performances {

	public static void main(String[] args) {
		// for loop performance
		long current = System.currentTimeMillis();
		long count = 0;
		for (int i = 0; i < 9999999; i++) {
			count = System.currentTimeMillis();
			count++;
		}
		System.out.println("Performance of for loop is: " + (System.currentTimeMillis() - current) + "ms");

		// for each performance
		current = System.currentTimeMillis();
		count = 0;
		int array[] = new int[9999999];
		for (int i = 0; i < 9999999; i++) {
			array[i] = i;
		}
		for (int i : array) {
			count = System.currentTimeMillis();
			count++;
		}
		System.out.println("Performance of for each loop is: " + (System.currentTimeMillis() - current) + "ms");

		// while loop performance
		current = System.currentTimeMillis();
		count = 0;
		int i = 0;
		while (i < 9999999) {
			count = System.currentTimeMillis();
			count++;
			i++;
		}
		System.out.println("Performance of while loop is: " + (System.currentTimeMillis() - current) + "ms");

		// do while loop performance
		current = System.currentTimeMillis();
		count = 0;
		i = 0;
		do {
			count = System.currentTimeMillis();
			count++;
			i++;
		} while (i < 9999999);
		System.out.println("Performance of do while loop is: " + (System.currentTimeMillis() - current) + "ms");

	}

}