package com.ofs.java.alosiyus.day6;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable{
	private static int count=0;
	private int id;
	
	@Override
	public void run() {
		System.out.println("####<task-"+id+">STARTING####");
		for(int i=10;i>0;i--) {
			System.out.println("<Task-"+id+">WORKINGK"+i);
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random()*1000));
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("****<TASK-"+id+">DONE****");
	}
	public LoopTaskA() {
		this.id=++count;
	}
}

