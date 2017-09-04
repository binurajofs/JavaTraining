package com.ofs.java.binu.day6;

public class Action {
	synchronized void Printaction(int n) {
		int i = 0;
		for (i = 0; i < n; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
