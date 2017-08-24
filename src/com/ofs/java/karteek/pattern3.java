package com.ofs.java.karteek;
class Pattern3{
	public static void main(String args[]){
		int coloumn = 1; 
		while(coloumn < 6){
			int row = 5;
			while(row >= coloumn){
				System.out.print("*");
				row--;
			}
			System.out.println("");
			coloumn++;
		}
	}

}