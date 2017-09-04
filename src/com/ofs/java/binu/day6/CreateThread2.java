package com.ofs.java.binu.day6;

public class CreateThread2 implements Runnable {

	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		CreateThread T1 = new CreateThread();
		Thread m1 = new Thread(T1);
		m1.start();
	}
}
