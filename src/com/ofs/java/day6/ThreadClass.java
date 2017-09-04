
/*
 * 
 * @Author : @Rajkamal;
 * @CODE ABOUT : @Thread Class in Thread 
 * 
 */
package com.ofs.java.day6;

public class ThreadClass extends Thread {

	// RUNNIING THE THREAD
	public void run() {
		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadClass t1 = new ThreadClass();
		// STARTING THE THREAD
		t1.start();
	}
}