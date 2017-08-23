import java.util.Scanner;
class IfElseDemo{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int quizScore = s.nextInt();
		int midScore = s.nextInt();
		int finalScore = s.nextInt();
		int avg;
		avg = (quizScore + midScore + finalScore)/3;
		if(avg >= 90)
			System.out.println("Grade is A");
		else if(avg < 90 && avg >= 70)
			System.out.println("Grade is B");
		else if(avg < 70 && avg >= 50)
			System.out.println("Grade is C");
		else if(avg < 50)
			System.out.println("Grade is F");
	}

}