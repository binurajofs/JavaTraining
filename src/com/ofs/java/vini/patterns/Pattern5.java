package com.ofs.java.vini.patterns;

public class Pattern5 {
	public static void main(String args[])
	{

		
	        int space=8;
	        for(int i=1; i<=5; i++)
	        {
	            //print first part of the row
	            for(int j=1; j<=i; j++)
	                System.out.print("*");
	             
	            //print space
	            for(int j=1;j<=space; j++)
	                System.out.print(" ");
	                 
	            //print second part of the row
	            for(int j=1; j<=i; j++)
	                System.out.print("*");
	             
	            //print new lint
	            System.out.println();   
	            space=space-2;
	        }
	    }
}
