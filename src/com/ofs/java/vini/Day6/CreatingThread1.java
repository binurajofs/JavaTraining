package com.ofs.java.vini.Day6;

class MyThread extends Thread 
{ 
     private int threadNum; 
     MyThread(int n) 
     { 
       threadNum = n; 
     } 
     public void run() 
     { 
       System.out.println("Thread Number " + threadNum + " is Running"); 
     } 
} 
      public class CreatingThread1 
   { 
           public static void main(String[] args) 
        { 
              System.out.println("Main thread Start"); 
              MyThread t1 = new MyThread(1); 
              MyThread t2 = new MyThread(2); 
              MyThread t3 = new MyThread(3); 
              t1.start(); // starts thread t1 
              t2.start(); // starts thread t2 
              t3.start(); // starts thread t3 
              System.out.println ("Main thread Finished"); 
        } 
  } 