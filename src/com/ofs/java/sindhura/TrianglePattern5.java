package com.ofs.java.sindhura;
import java.util.Scanner;
public class TrianglePattern5 
{
	public static void main(String[] args) 
	{
		int n=8;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			n=n-2;
		}

	}

}
