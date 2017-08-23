package com.ofs.java.somu;

public class Trianglepattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=5;
		for(i=1;i<=n;i++)
		{
			int j=0;
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=((2*i)-2);j<((2*n)-2);j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println("");
		}

	}

}
