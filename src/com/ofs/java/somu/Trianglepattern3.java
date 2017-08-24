package com.ofs.java.somu;

public class Trianglepattern3 {                // defining class
                                                 
	public static void main(String[] args) {   // main function starts
		// TODO Auto-generated method stub
		int n=5,i=0;                           // initializing i and n variable
		do                                     // do while loop starts 
		{
			int k=0;
			do                                 // second loop starts
			{
				System.out.print("");
				k++;
			      }while(k<=i);                // condition of second loop
			int j=0;
			do                                 // third loop starts
			{
				System.out.print("* ");
				j++;
			}while(j<n-i);                     // third loop condition
			System.out.println("");
			i++;
			 
			 }while(i<n);                      // first loop condition

	}

}                                              // end program
