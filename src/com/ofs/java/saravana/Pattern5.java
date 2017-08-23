package com.ofs.java.saravana;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<6;i++) {
	for(int j=0;j<6-i;j++) {
		System.out.print("* ");
	}
	for(int k=0;k<2*i;k++) {
		System.out.print(" ");
	}
	for(int k=0;k<2*i;k++) {
		System.out.print(" ");
	}
	for(int j=0;j<6-i;j++) {
		System.out.print("* ");
	}
	
	
	System.out.println();
}

}
	}


