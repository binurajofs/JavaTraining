/*****
 * 
 * 
 * Author : Rajkamal
 * 
 * Reffered Site : http://codeforwin.in/2015/07/c-program-to-print-hollow-diamond-star-pattern.html
 * 
 * 
 * ***/


package com.ofs.java.rajkamal;

public class TrianglePattern5 {

	public static void main(String[] args) {

		int i,n=5;
		for(i=1; i<=n; i++)
	    {
			int j;
	       //THIS FOR LOOP IS FOR PRINTING LEFT SIDE STAR
			for(j=1; j<=i; j++)
	        {
	            System.out.print("*");
	        }

	        for(j=(2*i-2); j<(2*n-2); j++)
	        {
	        	System.out.print(" ");
	        }
		       //THIS FOR LOOP IS FOR PRINTING RIGHT SIDE STAR
	        for(j=1; j<=i; j++)
	        {
	        	System.out.print("*");
	        }

	        System.out.println("");
	    }

	   
	}
	 
}

	
