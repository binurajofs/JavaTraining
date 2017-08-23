package com.ofs.java.mels.day1;

public class IfElse {

		
		public static void main(String a[]) {
			
			
			int quiz= 80;

			int term= 38;

			int score=90;	
			
			int avg=(quiz+term+score)/3;
			System.out.println("Average is : "+avg+"\n");
			char grade='D';
			if(avg>=90) {grade='A';}
					if(avg>= 70 && avg <90) { grade='B';}
					else
						if(avg>= 50 && avg <70) { grade='c';}
					else
						if(avg<50) { grade='F';}
					
					System.out.println("Your grade is : "+grade+"\n");		
		}
		
	}
