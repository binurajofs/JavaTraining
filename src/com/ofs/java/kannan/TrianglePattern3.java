package com.ofs.java.kannan;

public class TrianglePattern3 {

	public static void main(String[] args) {
		//for(int i=4;i>=0;i--) {
		int i=4;
		do {
			//for(int j=0; j<=i; j++) {
			int j=0;
			do {
				System.out.print("* ");
				j++;
			}while(j<=i);
			//}
		System.out.println("");
		i--;
		}while(i>=0);
			//}     

	}

}
