package com.ofs.java.karteek;
class pattern5{
	public static void main(String args[]){
		int row=5, coloumn=1, count;
		while(row >= 1){
			while(coloumn <= 2*row-1){
				System.out.print("*");
				coloumn++;
			}
			System.out.println("");
			count = 1;
			while(count < row){
				System.out.print(" ");
				count++;
			}
			row--;
		}

	}

}