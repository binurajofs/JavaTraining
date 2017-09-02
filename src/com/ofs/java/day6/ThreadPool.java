<<<<<<< HEAD
package com.ofs.java.day6;
	

	class ThreadPool implements Runnable {
	    private String message;
	    public ThreadPool(String s){
	        this.message=s;
	    }
	 
	    public void run() {
	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
	        processmessage();
	        System.out.println(Thread.currentThread().getName()+" (End)");
	    }
	 
	    private void processmessage() {
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
	    }
	   
	}


	

=======
package com.ofs.java.day6;
	

	class ThreadPool implements Runnable {
	    private String message;
	    public ThreadPool(String s){
	        this.message=s;
	    }
	 
	    public void run() {
	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
	        processmessage();
	        System.out.println(Thread.currentThread().getName()+" (End)");
	    }
	 
	    private void processmessage() {
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
	    }
	   
	}


	

>>>>>>> refs/remotes/origin/rajkamal
