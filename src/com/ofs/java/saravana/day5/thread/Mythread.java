package com.ofs.java.saravana.day5.thread;
public class Mythread extends Thread {
	public static int count = 10;
	public Mythread() {
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (Mythread.count > 0) {
			try {
				System.out.println("first thread");
				count--;
				Thread.sleep(10);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: " + iex.getMessage());
			}
		}
		System.out.println("End of thread");
	}
}
