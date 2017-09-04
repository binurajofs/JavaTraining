package com.ofs.java.saravana;


public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; 
		for(int i=1; i<=n; i++)
		    {
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }

		        for(int j=(2*i-2); j<(2*n-2); j++)
		        {
		            System.out.print(" ");
		        }

		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }

		        System.out.println();
		    }
	}
}
