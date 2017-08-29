package com.ofs.java.day4;

public class ExecutionTimeForLoop {

    public static void main(String[] args) throws InterruptedException {

		//start
        long lStartTime = System.nanoTime();

		//task
        calculation();

		//end
        long lEndTime = System.nanoTime();

		//time elapsed
        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output / 1000000);

    }

    private static void calculation() throws InterruptedException {
    	//USING FOR LOOP
    			for(int k=0;k<1000000;k++) {
    				System.out.println("USING FOR LOOP");
    				System.out.println(k);
    			}
    	

    }
}

