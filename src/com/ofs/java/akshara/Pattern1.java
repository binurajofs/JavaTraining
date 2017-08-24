package com.ofs.java.akshara;

public class Pattern1 {
	 public static void main(String []args) {
	      int j=5;
	      do { int i=1;
	    	  do {
	    		  System.out.print("*");
	    		  i++;
	    	  }while(i<=j);
	    	  System.out.println();
	    	  j--;
	      }while(j>0);
	   }


}
