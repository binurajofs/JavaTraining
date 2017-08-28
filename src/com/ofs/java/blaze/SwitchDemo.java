import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=0,quiz=0,midterm=0,final_score=0,average=0;
		System.out.println("Enter quiz score");
		quiz=in.nextInt();
		System.out.println("Enter midterm score");
		midterm=in.nextInt();
		System.out.println("Enter final score");
		final_score=in.nextInt();
		average=((quiz+midterm+final_score)/3);
		n=average/10;
		switch(n) {
		case 10: case 9:
			System.out.println("Your Grade is A");
			break;
		case 8: case 7:
			System.out.println("Your Grade is B");
			break;
		case 6: case 5:
			System.out.println("Your Grade is C");
			break;
		default:
			System.out.println("Your Grade is F");
			break;
		}
		in.close();
}
	}


