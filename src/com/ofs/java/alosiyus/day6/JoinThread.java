package com.ofs.java.alosiyus.day6;

public class JoinThread extends Thread {

	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JoinThread t1=new JoinThread();
JoinThread t2=new JoinThread();
JoinThread t3=new JoinThread();
t1.start();
try {
	t1.join(1500);
}catch(Exception e) {
	System.out.println( e);
}
t2.start();
t3.start();
	}

}
