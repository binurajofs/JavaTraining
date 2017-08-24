package com.ofs.java.binu;

public class Trianglepattern {                // creating class

	public static void main(String[] args) {  // main function
		// TODO Auto-generated method stub
		int i=4;                              // initializing i variable
		do                                    // starting of loop
		{
			int j=0;                          // initializing j variable
			do                                // another do-while loop starts
			{
				System.out.print("* ");       // printing *
				j++;
			}while(j<=i);                     // condition of second loop
			System.out.println("");           
			i--;                              // decrementing i variable  
		}while(i>0);                          // executing condition
	}

}
