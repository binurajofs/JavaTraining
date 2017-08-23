package com.ofs.java.saravana;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a=1;
		for (int i = 0; i < n; i++) {
			
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			
			for (int k = 0; k < 2 * i; k++) {
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
            for(int x=1;x<=a;x++)
            {
            	System.out.print("* ");
            }
			
			System.out.println();
		}
	}
}
