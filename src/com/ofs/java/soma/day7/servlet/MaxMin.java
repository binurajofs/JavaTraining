package com.ofs.java.soma.day7.servlet;

public class MaxMin {

	public static void main(String[] args) {
		               
	    //Array Number List
	    int numbers[] = new int[]{23,10,19,24,49,37,31};
	               
	    //Assign first element of an array to Maximum and Minimum
	    int maximum = numbers[0];
        int minimum = numbers[0];
	               
        for(int i=1; i< numbers.length; i++)
        {
           if(numbers[i] > maximum)
           maximum = numbers[i];
           else if (numbers[i] < minimum)
           minimum = numbers[i];
	                       
        }
	               
	       System.out.println("The max number is : " + maximum);
	       System.out.println("The min number is : " + minimum);
   }
}
