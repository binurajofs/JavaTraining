package com.ofs.java.saravana.day5.executor;

public class WorkerThread implements Runnable {
	 private String command;
	    
	    public WorkerThread(String s){
	        this.command=s;
	    }

	    @Override
	    public void run() {
	        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
	        processCommand();
	        System.out.println(Thread.currentThread().getName()+" End.");
	    }

	    private void processCommand() {
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
//Thread[pool-1-thread-2,5,main] Start. Command = line 1
	    
	  
}
