package com.ofs.java.binu;

public class Trianglepattern5 {                  // creating class

	public static void main(String[] args) {     // main function
		// TODO Auto-generated method stub
		int i,n=5;                               // initializing variables
		for(i=1;i<=n;i++)                        // for loop condition starts
		{
			int j=0;
			for(j=1;j<=i;j++)                    // second for loop
			{
				System.out.print("*");           // print *
			}
			for(j=((2*i)-2);j<((2*n)-2);j++)     // third for loop
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)                    // fourth for loop
			{
				System.out.print("*");           // print *
			}
		System.out.println("");
		}

	}

}                                                // end program
