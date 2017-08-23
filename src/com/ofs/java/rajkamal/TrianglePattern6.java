/*****
 * Author : Rajkamal
 * 
 * Reffered Site : http://codeforwin.in/2015/07/c-program-to-print-hollow-diamond-star-pattern.html
 * 
 * ***/


package com.ofs.java.rajkamal;

public class TrianglePattern6 {

	public static void main(String[] args) {

		int i,n=5;
		
		for(i=1; i<=n; i++)
	    {
			int j;
	        for(j=i; j<=n; j++)
	        {
	        	System.out.print("*");
	        }

	        for(j=1; j<=(2*i-2); j++)
	        {
	        	System.out.print(" ");
	        }

	        for(j=i; j<=n; j++)
	        {
	        	System.out.print("*");
	        }

	        System.out.println("");
	    }	   
	}
	 
}

	
