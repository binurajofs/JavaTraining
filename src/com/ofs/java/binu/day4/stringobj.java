package com.ofs.java.binu.day4;

public class stringobj {
	static int i = 0;

	public static void string() {
		for (i = 0; i < 10; i++) {
			String str = "uday";
			System.out.println(str);
		}
	}

	public static void stringnew() {
		for (i = 0; i < 10; i++) {
			String str = new String("uday");
			System.out.println(str);
		}
	}

	static public void stringchar() {
		for (i = 0; i < 10; i++) {

			char ch[] = { 'u', 'd', 'a', 'y' };
			String str = new String(ch);
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		long starttime = System.nanoTime();
		System.out.println(starttime);
		string();
		long endtime = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime - starttime));

		long starttime1 = System.nanoTime();
		System.out.println(starttime);
		stringnew();
		long endtime1 = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime1 - starttime1));
		long starttime2 = System.nanoTime();
		System.out.println(starttime2);
		stringchar();
		long endtime2 = System.nanoTime();
		System.out.println(endtime2);
		System.out.println("time taken is" + (endtime2 - starttime2));

	}

}
