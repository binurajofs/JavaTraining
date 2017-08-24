package com.ofs.java.akshara;

public class Pattern4 {
	public static void main(String[] args) {
		int i=5;
		do {
			int j=i,k=0;
			do {
				System.out.print(" ");
				j++;
			}while(j<6);
				do {
					System.out.print("* ");
					k++;
				}while(k<i);
				System.out.println();
		i--;		
		}while(i>0);
	}

}
