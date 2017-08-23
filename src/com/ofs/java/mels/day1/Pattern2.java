package com.ofs.java.mels.day1;

public class Pattern2 {

	public static void main(String args[]) {
		
		int i=0;	
		while(i<5) {
		
			int j=0;
			int k=4;
			while(k>i) {
				
				System.out.print(" ");
				k--;
			}
			
			while(j<=i) {
			System.out.print("* ");
			j++;
			}
			System.out.println("\n");
			i++;
		}
		
		
		
	}
}
