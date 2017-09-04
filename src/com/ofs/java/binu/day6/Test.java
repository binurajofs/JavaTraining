package com.ofs.java.binu.day6;

class Test {

public static void main(String args[]){  
	
	InterThreadCommunication c=new InterThreadCommunication(10000);

	new Thread() {
		public void run(){c.withdraw(15000);}
		}.start();
		
	new Thread(){
		public void run() {
		c.deposit(10000);}
		}.start();
}
}
