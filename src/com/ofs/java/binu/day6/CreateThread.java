package com.ofs.java.binu.day6;

public class CreateThread extends Thread {

	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		CreateThread T1 = new CreateThread();
		T1.start();
	}
}
