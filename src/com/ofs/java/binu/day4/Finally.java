package com.ofs.java.binu.day4;

public class Finally {

	public void method() {
		System.out.println("uday");

	}

	public static void main(String args[]) {

		try {
			Finally f = new Finally();
			f.method();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally clean up initialized objects ");
		}

	}
}
