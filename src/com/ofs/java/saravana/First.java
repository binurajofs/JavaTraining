package com.ofs.java.saravana;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int q=80,m=68 ,f=90;
  int avg;
  avg = (q+m+f)/3;
 
  if(avg>=90)
  {
   System.out.print("grade A");	  
  }
  else if(avg<90 && avg>=70)
  {
   System.out.print("grade B");	  
  }
  else if(avg<70 && avg>=50)
  {
   System.out.print("grade C");	  
  }
  else
  {
   System.out.print("grade F");	  
  }
  }
	}


