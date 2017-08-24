package com.ofs.java.karteek;
public class pattern2{
	public static void main(String args[]){
		int row = 1;
		while(row <= 5){
				
				int coloumn = 5;
				while(coloumn > row ){
					System.out.print(" ");
					coloumn--;
				}
				int count = 1;
				
				while(count <= 2*row-1){
					if(count%2 == 1)
					System.out.print("*");
					else
					System.out.print(" ");
					count++;
				}
				System.out.println();
			
			row++;
		}
	}

}