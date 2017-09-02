package com.ofs.java.alosiyus.day6;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	private String name;
	 
    public Task(String name) 
    {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    @Override
    public void run() 
    {
        try
        {
        	
            Long duration =  (long) (Math.random() * 10);
            System.out.println("Doing a task during : " + name);
            TimeUnit.SECONDS.sleep(duration);
            
        } 
        catch (Exception e) 
        {
            
            System.out.println(e);
        }
    }
}
