package com.ofs.java.saravana.day5.join;

public class Join {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Myrunnable()," thread1");
		Thread t2 = new Thread(new Myrunnable()," thread2");
		Thread t3 = new Thread(new Myrunnable()," thread3");
		t1.start();
		try {
			t1.join();
		}catch(Exception e)
		{
			System.out.println("erroor");
		}
		
		t3.start();
		try {
			t2.join();
		}catch(Exception e)
		{
			System.out.println("erroor");
		}
	
		t2.start();
		
	}
	

}
