package com.ofs.java.vini.Day4;

public class ObjectCreation {
	public static void main(String... args) {
		for (int i = 0; i < 10; i++) {
			testInsideLoop();
			testOutsideLoop();
		}
	}

	private static void testInsideLoop() {
		long start = System.nanoTime();
		int[] counters = new int[144];
		int runs = 200 * 1000;
		for (int i = 0; i < runs; i++) {
			int x = i % 12;
			int y = i / 12 % 12;
			int times = x * y;
			counters[times]++;
		}
		long time = System.nanoTime() - start;
		System.out.printf("Inside: Average loop time %.1f ns%n", (double) time
				/ runs);
	}

	private static void testOutsideLoop() {
		long start = System.nanoTime();
		int[] counters = new int[144];
		int runs = 200 * 1000, x, y, times;
		for (int i = 0; i < runs; i++) {
			x = i % 12;
			y = i / 12 % 12;
			times = x * y;
			counters[times]++;
		}
		long time = System.nanoTime() - start;
		System.out.printf("Outside: Average loop time %.1f ns%n", (double) time
				/ runs);
	}

}
