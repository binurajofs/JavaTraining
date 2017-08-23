package com.ofs.java.saravana;

public class Pattern3 {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int i=0;
		while(i<5) {
			int j=0;
	         while(j<5-i){
	             System.out.print(" ");
	         j++;
	         }
	         int k=0;
	        while(k<=i) {
	            System.out.print("* ");
	        k++;
	        }
	        System.out.println();  
	        i++;
		}
	}
}
