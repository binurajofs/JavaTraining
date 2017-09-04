package com.ofs.java.binu.day6;

public class MyThread2 extends Thread {
	Action t;

	MyThread2(Action t) {
		this.t = t;

	}

	public void run() {
		t.Printaction(10);
	}
}
