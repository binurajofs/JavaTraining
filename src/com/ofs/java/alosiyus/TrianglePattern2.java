package com.ofs.java.alosiyus;

public class TrianglePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;
		int n = row;
		int j=0;
		while(j<row) {
		int i=0;
		int k=0;
		while(n>k)
		{
			System.out.print(" ");
			k++;
		}
			while(i<j) {
				
				System.out.print("* ");
				i++;		
			}
		System.out.println();
		j++;
		n--;
		}
		}

	}