package com.ofs.java.alosiyus;
public class TrianglePattern6 {

	public static void main(String[] args) {
		int size;
		int s=1,i,j;
		for(size=5;size>=1;size--) {
			for(i=1;i<=size;i++) {
				System.out.print("*");
				
			}
			for(j=s;j>1;j--) {
			System.out.print("  ");
			}
	for(i=size;i>=1;i--) {
		System.out.print("*");
		}
	
	
	System.out.println();
	s++;
		}
		
	}

}
