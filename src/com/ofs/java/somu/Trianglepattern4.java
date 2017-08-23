package com.ofs.java.somu;

public class Trianglepattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
do
{
	int j=i;
	do
	{
		System.out.print("* ");
		j++;
	}while(j<5);
	System.out.println();
	int k=0;
	do
	{
		System.out.print(" ");
		k++;
	}while(k<=i);
	i++;
}while(i<5);
	}
}
