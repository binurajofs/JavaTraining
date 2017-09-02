package com.ofs.java.alosiyus.day6;

public class RunnableClassExample implements Runnable {
	public void run() {
		System.out.println("This is thread created by runnable interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableClassExample r1 = new RunnableClassExample();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
