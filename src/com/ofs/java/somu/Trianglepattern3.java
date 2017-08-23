package com.ofs.java.somu;

public class Trianglepattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i=0;
		do
		{
			int k=0;
			do
			{
				System.out.print("");
				k++;
			      }while(k<=i);
			int j=0;
			do
			{
				System.out.print("* ");
				j++;
			}while(j<n-i);
			System.out.println("");
			i++;
			 
			 }while(i<n);

	}

}
