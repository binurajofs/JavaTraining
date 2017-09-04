package com.ofs.java.binu.day6;

public class InterThreadCommunication {

	int amount;
	private int bal;

	public InterThreadCommunication(int bal) {
		this.bal = bal;
	}

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (bal < amount) {
			System.out.println(bal);
			System.out.println("amount to be withdraw:" + amount);
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		bal -= amount;
		System.out.println("withdraw completed...");
		System.out.println("balance after withdraw:" + bal);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		bal += amount;
		System.out.println("amount deposited:" + amount);
		System.out.println("deposit completed... ");
		System.out.println("Present bal:" + bal);
		notify();
	}
}
