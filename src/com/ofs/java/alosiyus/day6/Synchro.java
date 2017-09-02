package com.ofs.java.alosiyus.day6;

public class Synchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender snd = new Sender();
        ThreadedSend S1 = new ThreadedSend(" Hi ", snd);
        ThreadedSend S2 = new ThreadedSend(" Bye ", snd);
        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();
	}

}
class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
// Class for send a message using Threads
class ThreadedSend extends Thread {
    private String msg;
    Sender sender;
    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }
    public void run() {
        // Only one thread can send a message
        // at a time.
        synchronized (sender) {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}
