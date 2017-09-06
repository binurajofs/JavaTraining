package com.ofs.java.rinosh.day4;

public class ObjectCreation {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + 1;
			System.out.println("OUTSIDE LOOP : " + sum);

		}
		for (int j = 0; j < 10; j++) {
			int sum1 = 0;
			sum1 = sum1 + 1;
			System.out.println("INSIDE LOOP : " + sum1);
		}

	}

}