package com.ofs.java.saravana.day5.join;

public class Myrunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			System.out.println("Stated "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println("Exception");
			}
			System.out.println(Thread.currentThread().getName()+" was ended");
		}
	}
           

