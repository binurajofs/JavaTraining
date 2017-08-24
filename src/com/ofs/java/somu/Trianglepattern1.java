package com.ofs.java.somu;


public class Trianglepattern1 {   // creating class

	public static void main(String[] args) {  // main function
		// TODO Auto-generated method stub
        int i=1,j=0;                          // initializing i and j variable
		while(i<=5)                           // while loop starts
         {
	      while(j<i)                          // second while loop
	       {
		     System.out.print("* ");          // printing *
		     j++;  
	       }
	      j=0;
	      i++;                                // incrementing i
	     System.out.println();     
        }
      }
   }                                          // end program




