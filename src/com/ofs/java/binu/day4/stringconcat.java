package com.ofs.java.binu.day4;

public class stringconcat {
	static String str1 = "uday";
	static String str2 = "uday";
	static int i = 0;

	public static void plus() {
		for (i = 0; i < 10; i++) {
			String str3 = str1 + str2;
			System.out.println(str3);
		}
	}

	public static void concat() {
		for (i = 0; i < 10; i++) {
			String str2 = str1.concat("kumar");
			System.out.println(str2);
		}
	}

	public static void stringbuffer() {
		for (i = 0; i < 10; i++) {
			StringBuffer sBuffer = new StringBuffer();
			sBuffer.append("uday").append(" ").append("kumar");
			System.out.println(sBuffer.toString());
		}

	}

	public static void stringbuilder() {
		for (i = 0; i < 10; i++) {
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("uday").append(" ").append("kumar");
			System.out.println(sBuilder.toString());
		}

	}

	public static void main(String[] args) {
		long starttime = System.nanoTime();
		System.out.println(starttime);
		plus();

		long endtime = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime - starttime));

		long starttime1 = System.nanoTime();
		System.out.println(starttime);
		concat();
		long endtime1 = System.nanoTime();
		System.out.println(endtime);
		System.out.println("time taken is" + (endtime1 - starttime1));
		long starttime2 = System.nanoTime();
		System.out.println(starttime2);
		stringbuffer();
		long endtime2 = System.nanoTime();
		System.out.println(endtime2);
		System.out.println("time taken is" + (endtime2 - starttime2));

		long starttime3 = System.nanoTime();
		System.out.println(starttime3);
		stringbuffer();
		long endtime3 = System.nanoTime();
		System.out.println(endtime3);
		System.out.println("time taken is" + (endtime3 - starttime3));

	}

}
