package com.ofs.java.binu;

public class Sample3 {
	public static void main(String args[]){
		int space=8, j, i;
	
		for(i=1;i<=5;i++)
		{
			for(j=0;j<=i;j++)
			System.out.print(" * ");
			
			for(j=0;j<=space;j++)
			System.out.print("   ");
			
			for(j=0;j<=i;j++)
			System.out.print(" * ");
				
			System.out.println();
			space=space-2;
		}
	}
}
