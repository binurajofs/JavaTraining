package com.ofs.java.binu;

public class Trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		do
		{
			int j=0;
			do
			{
				System.out.print("* ");
				j++;
			}while(j<=i);
			System.out.println("");
			i--;
		}while(i>0);
	}

}
