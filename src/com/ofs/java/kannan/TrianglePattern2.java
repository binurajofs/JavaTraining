package com.ofs.java.kannan;

public class TrianglePattern2 {
	public static void main(String[] args) {
		int n=5,i=0;
		//for (int i = 0; i < n; i++) {
		while(i<n) {
            //for (int j = 0; j < n - i; j++) {
            int j=0;
            while(j<n-i) {
			System.out.print(" ");
			j++;
            }
            //}
            //for (int k = 0; k <= i; k++) {
            int k=0;
            while(k<=i) {
                 System.out.print("* ");
                 k++;
            }
            //}
            System.out.println();
		i++;
		}
       //}
	}
}