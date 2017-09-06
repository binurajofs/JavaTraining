package com.ofs.java.vini.Day6;

public class MultiThreading {
	public static void main(String args[]) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
		synchronized (a) {
			try {
				System.out.println("wait for thread A to complete");
				a.wait();

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("totalof thread a is:" + a.total);

		}
		synchronized (b) {
			try {

				System.out.println("wait for thread B to complete");
				b.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("total of thread b is:" + b.total1);
		}
	}
}

class ThreadA extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
	}
}

class ThreadB extends Thread {
	int total1;

	public void run() {
		synchronized (this) {
			for (int j = 0; j < 50; j++) {
				total1 += j;
			}
			notify();
		}
	}
}
