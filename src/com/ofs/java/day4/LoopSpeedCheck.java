package com.ofs.java.day4;

public class LoopSpeedCheck {

	public static void main(String[] args) {
		
		int i=0,j=0;
		
		//USING FOR LOOP
		for(int k=0;k<1000000;k++) {
			System.out.println("USING FOR LOOP");
			System.out.println(k);
		}
		//USING DO WHILE LOOP
		do
		{
			System.out.println("USING WHILE LOOP");
			System.out.println(j);
		j++;
		}while(j<1000000);
		//USING WHILE LOOP
		while(i<1000000)
		{
			System.out.println("USING DO WHILE LOOP");
			System.out.println(i);
		i++;
		}
		
		
	}

}
