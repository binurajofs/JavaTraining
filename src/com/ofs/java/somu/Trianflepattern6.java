package com.ofs.java.somu;

public class Trianflepattern6 {                 // creating class 

	public static void main(String[] args) {    // main function
		// TODO Auto-generated method stub
		 int i, n=5;                            // initializing variables
		 for(i=1;i<=n;i++)                      // for loop starts
		 {
			 int j=0;
			 for(j=i;j<=n;j++)                  // second for loop
			 {
				 System.out.print("*");
			 }
			 for(j=1;j<=((2*i)-2);j++)          // third for loop
			 {
				 System.out.print(" ");
			 }
			 for(j=i;j<=n;j++)                  // fourth for loop
			 {
				 System.out.print("*");         // print *
			 }
		 System.out.println("");
		 }
		 
	}

}                                               // end program
