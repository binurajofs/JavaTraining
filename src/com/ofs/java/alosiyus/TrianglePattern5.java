package com.ofs.java.alosiyus;

public class TrianglePattern5 {

	public static void main(String[] args) {
		int size=5;
		int s,i,j,k=size;
		for(s=1;s<=size;s++) {
			for(i=1;i<=s;i++) {
				System.out.print("*");
				
			}
			for(j=k;j>1;j--) {
			System.out.print("  ");
			}
	for(i=s;i>=1;i--) {
		System.out.print("*");
		}
	
	k--;
	System.out.println();
		}
		
	}

}
