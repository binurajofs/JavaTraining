package day2;

public class MathDemo2 extends MathDemo1 {
	// define div method
	public int div(int val_a, int val_b) {
		System.out.println("Method in MathDemo2");
		if (val_b == 0) {
			System.out.println("Infinity");
			return val_b;
		} else {
			return (val_a / val_b);
		}
	}
}
