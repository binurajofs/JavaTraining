package com.ofs.java.karteek.day1;
class Pattern1{
	public static void main(String args[]){
		int coloumn = 1; 
		while(coloumn < 6){
			int row = 1;
			while(row <= coloumn){
				System.out.print("*");
				row++;
			}
			System.out.println("");
			coloumn++;
		}
	}

}