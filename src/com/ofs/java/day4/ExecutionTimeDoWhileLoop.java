package com.ofs.java.day4;


public class ExecutionTimeDoWhileLoop {

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
int j=0;
    	//USING DO WHILE LOOP
    			do
    			{
    				System.out.println("USING DO WHILE LOOP");
    				System.out.println(j);
    			j++;
    			}while(j<1000000);

    }
}

