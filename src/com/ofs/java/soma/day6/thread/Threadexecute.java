package com.ofs.java.soma.day6.thread;

public class Threadexecute implements Runnable {

	// TODO Auto-generated method stub

	@Override
	public void run() {

		try {
			int i = 0;
			while (i < 10) {
				System.out.println("i value is: " + i);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public Threadexecute() {
		System.out.println("Hi");
	}

}
