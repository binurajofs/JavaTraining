import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int quiz=0,midterm=0,final_score=0,average=0;
		System.out.println("Enter quiz score:");
		quiz=in.nextInt();
		System.out.println("Enter midterm score:");
		midterm=in.nextInt();
		System.out.println("Enter final score:");
		final_score=in.nextInt();
		average=((quiz+midterm+final_score)/3);
		if(average>=90) {
			System.out.println("Your Grade is A");
		}
		else if(average>=70 && average<90) {
			System.out.println("Your Grade is B");
		}
		else if(average>=50 && average<70) {
			System.out.println("Your Grade is C");
		}else {
			System.out.println("Your Grade is F");
		}
		in.close();
		////

	}

}