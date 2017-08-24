package com.ofs.java.akshara;

public class Pattern6 {

	public static void main(String[] args) {
		int gap=0;
        for(int i=5; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
                System.out.print(" * ");
            for(int j=1;j<=gap; j++)
                System.out.print("   ");
            for(int j=i; j>=1; j--)
                System.out.print(" * ");
            System.out.println();   
            gap=gap+2;
             
        }// TODO Auto-generated method stub

	}

}
