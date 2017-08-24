package com.ofs.java.karteek;
class Pattern4{
	public static void main(String args[]){
		int row = 1;
		while(row <= 5){
			int coloumn = 5;
			while(coloumn >= row ){
				System.out.print("*");
				coloumn--;
			}
			System.out.println();
			int count = 1;
			while(count <= 2*row-1){
				System.out.print(" ");
				count++;
			}
			
			row++;
		}
	}

}