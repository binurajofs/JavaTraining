package com.ofs.java.soma.day6.thread;

public class Synchronize {
	public static void main(String args[])
	{
		Sender send = new Sender();
		ThreadSend s1 = new ThreadSend("Good",send);
		ThreadSend s2 = new ThreadSend("Good",send);
		s1.start();
		s2.start();
	}

}
class Sender{
	public void send(String msg) {
		System.out.println("Value is:"+msg);
	
	try {
		Thread.sleep(1000);
	}catch(Exception e)
	{
		System.out.println("Error occured");
	}
}
}
class ThreadSend extends Thread{
	String msg;
	Sender sender;
	ThreadSend(String m, Sender obj){
		msg=m;
		sender=obj;
	}
	public void run() {
		synchronized(sender){
			sender.send(msg);
		}
	}
}
		


