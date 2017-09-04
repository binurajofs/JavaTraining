package com.ofs.java.binu.day1;

public class TrianglePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		do// while(i<5)
		{
			int j = i;
			do// while(j<5)
			{
				System.out.print("* ");
				j++;
			} while (j < 5);
			System.out.println();
			int k = 0;
			do {
				System.out.print(" ");
				k++;
			} while (k <= i);

			i++;
		} while (i < 5);
	}

}
