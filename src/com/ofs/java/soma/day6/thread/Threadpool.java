package com.ofs.java.soma.day6.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService name = Executors.newFixedThreadPool(2);
		name.execute(new Threadexecute());
		name.execute(new Threadexecute());
		name.shutdown();
	}
}
