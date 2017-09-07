package com.ofs.java.soma.day4;

public class Task6 {
	public static void main(String args[])
	{
		int calc=0;
		{
			for(int i=0;i<=5;i++)
			{
				calc=calc+1;
				System.out.println("Outside the loop: "+calc);
			}
			
		}
		System.out.println("");
		for(int j=0;j<=5;j++) {
			int val=0;
		    val=val+1;
		    System.out.println("Inside the loop: "+val);
		    
		}
		
		

	}

}
