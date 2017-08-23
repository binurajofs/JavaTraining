package com.ofs.java.saravana;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q = 80, m = 68, f = 90;
		int avg;
		avg = (q + m + f) / 3;
		
		switch (avg/10) {
		case 9:
			System.out.println(" Grade A");
			break;
		case 8:
			System.out.println(" Grade B");
			break;
		case 7:
			System.out.println(" Grade B");
			break;
		case 6:
			System.out.println(" Grade C");
			break;
		case 5:
			System.out.println(" Grade C");
			break;
		default:
			System.out.println(" Grade F");
			break;
		
		}

	}

}
