package day2;

public class MethodOverLoadDemo {
	// create a method to do algebra operations;
	// Method name should be calculateLHS() and calculateRHS; and calculate RHS and
	// LHS
	// Pass inputs as parameter;
	// 1) ac + bc = c(a + b)
	// 2) a3 + b3 = (a + b)(a2 - ab + b2)
	// methods with return type;
	public int computeLHS(int vari_a, int vari_b, int vari_c) {
		return ((vari_a * vari_c) + (vari_b * vari_c));
	}

	public int computeLHS(int vari_a, int vari_b) {

		return ((vari_a * vari_a * vari_a) + (vari_b * vari_b * vari_b));
	}

	public int computeRHS(int vari_a, int vari_b, int vari_c) {
		return (vari_c * (vari_a + vari_b));
	}

	public int computeRHS(int vari_a, int vari_b) {
		return ((vari_a + vari_b) * ((vari_a * vari_a) - (vari_a * vari_b) + (vari_b * vari_b)));
	}
}
