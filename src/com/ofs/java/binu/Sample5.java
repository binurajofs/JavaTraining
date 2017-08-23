package com.ofs.java.binu;
import java.util.Scanner;


public class Sample5 {
   public static void main(String args[]){
	   int q,m,f,avg,n=0;
	   Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the value of q:\n");
	   q = sc.nextInt();
	   System.out.print("Enter the value of m:\n");
	   m = sc.nextInt();
	   System.out.print("Enter the value of f:\n");
	   f = sc.nextInt();
	   avg=(q+m+f)/3;
	   if(avg>=90){
          System.out.println("garde : A");
	        n=1;}
	   else if(avg>=70 || avg<=90){
		   System.out.println("grade B");
	        n=2;}
	   else if(avg>=50 || avg<=70){
		   System.out.print("grade c");
	     	n=3;}
	   if(avg<50){
		   System.out.print("grade f");
	        n=4;}
	        
	      switch(n){
	 	   case 1: 
	 		   System.out.println("grade A");
	 		   break;
	 	   case 2:
	 		   System.out.println("grade B");
	 		   break;
	 	   case 3:
	 		   System.out.println("grade C");
	 		   break;
	   
   }
   
}
}

