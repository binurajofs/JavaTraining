package com.ofs.java.binu.day4;

public class doWhile {
	public static void dowhilelp() {
		int i = 0;
		do {
			System.out.println("uday");
			i++;
		} while (i < 100);
	}

	public static void main(String[] args) {

		long starttime = System.nanoTime();
		System.out.println(starttime);
		dowhilelp();
		long endtime = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime - starttime));
	}

}
