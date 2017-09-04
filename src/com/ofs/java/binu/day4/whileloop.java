package com.ofs.java.binu.day4;

public class whileloop {
	public static void whilelp() {
		int i = 0;
		while (i < 100) {
			System.out.println("uday");
			i++;
		}
	}

	public static void main(String[] args) {
		long starttime = System.nanoTime();
		System.out.println(starttime);
		whilelp();
		long endtime = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime - starttime));
	}
}