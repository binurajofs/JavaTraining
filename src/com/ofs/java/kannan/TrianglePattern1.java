package com.ofs.java.kannan;

public class TrianglePattern1 {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			int j=0;
			while(j<=i){
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
