package com.ofs.java.kannan.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=1;i<=10;i++) {
			ThreadPoolBase Thread = new ThreadPoolBase(""+i);
			executor.execute(Thread);
		}
		System.out.println("After Syncronization");
		for(int i=1;i<=10;i++) {
			ThreadPoolBase Thread = new ThreadPoolBase(""+i);
			Thread.function();			
		}
		executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Completed");
        
        
	}

}
