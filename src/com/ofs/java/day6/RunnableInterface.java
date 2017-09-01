/*
 * 
 * @Author : @Rajkamal;
 * @CODE ABOUT : @RunnableInterface in Thread 
 * 
 */

package com.ofs.java.day6;

import java.util.Scanner;

public class RunnableInterface implements Runnable {
	// RUNNING THE THREAD
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("ENTER A NUMBER");
		try {
			Thread.sleep(5000);
			Scanner in = new Scanner(System.in);
			int s = in.nextInt();
			in.close();

			for (int i = 0; i < s; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}

		}

		catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	// CALLING THE RUNNABLE INTERFACE
	public static void main(String args[]) {
		RunnableInterface m1 = new RunnableInterface();
		Thread t1 = new Thread(m1);
		// STARTING THE THREAD
		t1.start();
	}
}
