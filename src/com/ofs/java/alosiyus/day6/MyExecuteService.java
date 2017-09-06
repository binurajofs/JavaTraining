package com.ofs.java.alosiyus.day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyExecuteService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main thread starts here");
ExecutorService execservice= Executors.newFixedThreadPool(3);
execservice.execute(new LoopTaskA());
execservice.execute(new LoopTaskA());
execservice.execute(new LoopTaskA());
execservice.shutdown();
System.out.println("main thread ends here");
	}

}
