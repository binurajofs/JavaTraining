package com.ofs.java.binu;

public class Trianglepattern2 { // creating class

	public static void main(String[] args) { // main function starts
		// TODO Auto-generated method stub
		int i = 0; // initializing i variable
		while (i < 5) // loop condition
		{
			int j = 0; // initializing j variable
			while (j < 5 - i) // another loop condition
			{
				System.out.print(" ");
				j++; // incrementing j
			}
			int k = 0; // initializing k variable
			while (k <= i) // loop condition for k
			{
				System.out.print("* "); // printing *
				k++; // incrementing k
			}
			System.out.println("");
			i++;
		}

	}
} // program end
