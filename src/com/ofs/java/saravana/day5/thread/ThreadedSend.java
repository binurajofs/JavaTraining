package com.ofs.java.saravana.day5.thread;

public class ThreadedSend extends Thread {

	 private String msg;
	    private Thread t;
	    Syn  sender;

	    // Recieves a message object and a string
	    // message to be sent
	    ThreadedSend(String m,  Syn obj)
	    {
	        msg = m;
	        sender = obj;
	    }

	    public void run()
	    {
	        // Only one thread can send a message
	        // at a time.
	        synchronized(sender)
	        {
	            // synchronizing the snd object
	            sender.send(msg);
	        }
	    }
	}

	// Driver class
	class SyncDemo
	{
	    public static void main(String args[])
	    {
	    	Syn snd = new Syn();
	        ThreadedSend S1 =
	            new ThreadedSend( " Hi " , snd );
	        ThreadedSend S2 =
	            new ThreadedSend( " Bye " , snd );

	        // Start two threads of ThreadedSend type
	        S1.start();
	        S2.start();

	        // wait for threads to end
	        try
	        {
	            S1.join();
	            S2.join();
	        }
	        catch(Exception e)
	        {
	            System.out.println("Interrupted");
	        }
	    }
	}


