package com.ofs.java.binu;

public class Sample4 {
	public static void main(String args[]){
		int space=0, j, i;
	
		for(i=5;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			System.out.print(" * ");
			
			for(j=1;j<=space;j++)
			System.out.print("   ");
			
			for(j=i;j>=1;j--)
			System.out.print(" * ");
				
			System.out.println();
			space=space+2;
		}
	}

}
