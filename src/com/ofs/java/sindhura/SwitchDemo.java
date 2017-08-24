package com.ofs.java.sindhura;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
			int quiz=0,midterm=0,final_score=0,average=0;
			System.out.println("Enter quiz score");
			quiz=in.nextInt();
			System.out.println("Enter midterm score");
			midterm=in.nextInt();
			System.out.println("Enter final score");
			final_score=in.nextInt();
			average=((quiz+midterm+final_score)/3);
			int n=average/10;
			switch(n) {
			case 10: case 9:
				System.out.println("Grade A");
				break;
			case 8: case 7:
				System.out.println("Grade B");
				break;
			case 6: case 5:
				System.out.println("Grade C");
				break;
			default:
				System.out.println("Grade F");
				break;
			}
			in.close();

	}

}
