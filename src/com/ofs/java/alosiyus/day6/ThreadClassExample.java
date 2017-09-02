package com.ofs.java.alosiyus.day6;

public class ThreadClassExample extends Thread{
public void run() {
   System.out.println("This is a thread");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadClassExample t1= new ThreadClassExample();
t1.start();
	}

}
