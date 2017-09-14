package com.ofs.java.kannan.threads;

public class ThreadPoolBase implements Runnable {

	String executionOrder;

	ThreadPoolBase(String executionOrder) {
		this.executionOrder = executionOrder;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start Order " + executionOrder);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(Thread.currentThread().getName() + " Finished");
	}
	
	public synchronized void function() {
		System.out.println(Thread.currentThread().getName() + " Start Order " + executionOrder);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(Thread.currentThread().getName() + " Finished");
	}  
}
