package com.ofs.java.saravana.day5.thread;

public class Mainclassthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mythread t = new Mythread();
t.start();
while(Mythread.count>0) {
	try {
		System.out.println("main thread is running");
		Mythread.count--;
		Mythread.sleep(10);
	}catch(Exception e) {
		System.out.println("exception occured sorry");
	}
}
	}

	}


