import java.util.Scanner;
public class StudentGrade{
	/*This class reads scores of a student in each exam and asssigns a grade based on average of marks*/
	public static void main(String[] args){
		int quiz;
		int mid_term;
		int final_score;
		float avg;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter score for quiz:");
		quiz=in.nextInt();
		System.out.println("Enter score for mid term:");
		mid_term=in.nextInt();
		System.out.println("Enter score for final");
		final_score=in.nextInt();
		avg=(quiz+mid_term+final_score)/3;
		if (avg>=90){
			 System.out.println("Your grade is:A");
		}
		else if(avg>=70 && avg< 90){
			System.out.println("Your grade is:B");
		}
		else if(avg>=50 && avg< 70){
			System.out.println("Your grade is:C");
		}
		else if (avg<50){
			System.out.println("Your grade is:F");
		}
		
	}

}