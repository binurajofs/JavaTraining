package com.ofs.java.mels.day1;

public class Pattern4 {

	public static void main(String args[]) {
		
		int i=0;	
		do{
		
			int j=5;
			int k=0;
				do{
					
					System.out.print(" ");
					k++;
				}while(k<i+1);
				
				 do{
					System.out.print("* ");
					j--;
				}while(j>i);
			System.out.println("\n");
			i++;
		}while(i<5) ;
		
		
		
	}
}
