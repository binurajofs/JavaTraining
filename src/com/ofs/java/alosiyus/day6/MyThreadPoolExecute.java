package com.ofs.java.alosiyus.day6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPoolExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadPoolExecutor executor =  (ThreadPoolExecutor) Executors.newCachedThreadPool();
	        for (int i = 0; i <= 5; i++) 
	        {
	            Task task = new Task("task :"+i);
	            System.out.println("A new task has been added : " + task.getName());
	            executor.execute(task);
	        }
	        executor.shutdown();
	    }
	}


