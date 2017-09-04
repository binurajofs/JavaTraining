package com.ofs.java.binu.day6;

public class MyThread1 extends Thread {
	Action t;

	MyThread1(Action t) {
		this.t = t;

	}

	public void run() {
		t.Printaction(5);
	}
}
