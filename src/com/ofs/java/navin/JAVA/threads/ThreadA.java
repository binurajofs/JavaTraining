package com.ofs.java.navin.threads;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Total is: "+b.total);
		}
	}

}

class ThreadB extends Thread{
	int total;
	public void run() {
		synchronized(this) {
			for(int i=0;i<100;i++) {
				total+=i;
			}
			System.out.println("b is completed...!!!");
			notify();
		}
	}
}