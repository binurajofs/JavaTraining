package com.ofs.java.karteek.day1;
class pattern4 {
	public static void main(String args[]){
		int row=5, coloumn, count;
		while(row >= 1){
			coloumn=1;
			while(coloumn <= row){
				System.out.print("* ");
				coloumn++;
			}
			System.out.println("");
			
			
			row--;
			count = 5;
			while(count > row){
				System.out.print(" ");
				count--;
			}
			
		}

	}


}