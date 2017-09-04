package com.ofs.java.binu.day6;

class WorkingThread implements Runnable {
	private String msg;

	public WorkingThread(String s) {
		this.msg = s;

	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "(start)message =" + msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "(End)");
	}
}
