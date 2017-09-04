package com.ofs.java.binu.day6;

public class Synchronise {
	public static void main(String[] args) {
		Action m = new Action();
		MyThread1 t1 = new MyThread1(m);
		MyThread2 t2 = new MyThread2(m);
		t1.start();
		t2.start();
	}
}
