package com.ofs.java.saravana.day5.syn;
class Sender {
	public void print(String msg) {
		System.out.println("Sending " + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("sorry exception occured");
		}
		System.out.println(msg + " send");
	}
}
// Class for send a message using Threads
class ThreadedSend extends Thread {
	String m;
	Sender s;
	ThreadedSend(String str, Sender obj) {
		m = str;
		s = obj;
	}
	public void run() {
		synchronized (s) {
			s.print(m);
		}
	}
}
// Driver class
class Syncro {
	public static void main(String[] args) {
		Sender k = new Sender();
		ThreadedSend s1 = new ThreadedSend("hai", k);
		ThreadedSend s2 = new ThreadedSend("bye", k);
		s1.start();
		s2.start();
	}
}
