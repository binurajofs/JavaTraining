package com.ofs.java.binu.day4;

public class forloop {

	public static void forlp() {
		int i = 0;
		for (i = 0; i < 100; i++) {
			System.out.println("uday");

		}
	}

	public static void main(String[] args) {

		long starttime = System.nanoTime();
		System.out.println(starttime);
		forlp();
		long endtime = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime - starttime));
	}
}
