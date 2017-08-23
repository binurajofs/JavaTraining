package com.ofs.java.mels.day1;

public class SwitchDemo {
	
	public static void main(String a[]) {
	
	char grade='p';
	int quiz= 60;

	int term= 69;

	int score=90;	
	int avg=(quiz+term+score)/3;
	if(avg>=90) {grade='A';}
	else
		if(avg>= 70 && avg <90) { grade='B';}
	else
		if(avg>= 50 && avg <70) { grade='c';}
	else
		if(avg<50) { grade='F';}
	
		
	switch(grade) {
	
	case 'A': 	
		System.out.println("Average is : "+avg+"\n");
		System.out.println("Your grade is : A\n");		
		break;
	case 'B':  	
		System.out.println("Average is : "+avg+"\n");
		System.out.println("Your grade is : B\n");		
		break;
	 
	case 'C':  
		System.out.println("Average is : "+avg+"\n");
		System.out.println("Your grade is : D\n");		
		break;

	default: 
		System.out.println("Average is : "+avg+"\n");
		System.out.println("Your grade is : F\n");			
		break;
	
	}


	
	
}

}
