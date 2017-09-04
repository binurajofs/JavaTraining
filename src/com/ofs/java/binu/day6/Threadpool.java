package com.ofs.java.binu.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			WorkingThread w = new WorkingThread("" + i);
			Thread t1 = new Thread(w);
			executor.execute(t1);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}
