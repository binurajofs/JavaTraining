package com.ofs.java.navin.threads;

public class RunnableInterface implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterface runnableinterface = new RunnableInterface();
		Thread thread = new Thread(runnableinterface);
		thread.start();
	}
}
