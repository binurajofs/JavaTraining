package com.ofs.java.binu;

public class Trianglepattern4 {              // defining class

	public static void main(String[] args) { // main function starts
		// TODO Auto-generated method stub
int i=0; 
do                                           // first do while loop starts
{
	int j=i;
	do                                      //  second do while loop starts
	{
		System.out.print("* ");             // print *
		j++;
	}while(j<5);                            // second loop condition checking
	System.out.println();
	int k=0;
	do                                      //  third do while loop starts
	{
		System.out.print(" ");
		k++;
	}while(k<=i);                           // second loop condition checking
	i++;
}while(i<5);
	}
}                                           // end program
