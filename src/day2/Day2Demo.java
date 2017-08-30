package day2;

public class Day2Demo {

	public static void main(String args[]) {

		MethodDemo obj = new MethodDemo();
		// call method one;
		obj.sum(10, 20);
		// call method two and print the return value;
		System.out.println(obj.sumReturn(10, 30));
		// --------------------------------------------------------------------------------------------------------------//
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		System.out.println("variable values a=10 b=5 c=4 Applied Formula: ac +bc =c(a+b)");
		System.out.println("LHS is" + methodOverLoadDemo.computeLHS(10, 5, 4));
		System.out.println("RHS is" + methodOverLoadDemo.computeRHS(10, 5, 4));
		if (methodOverLoadDemo.computeLHS(10, 5, 4) == methodOverLoadDemo.computeRHS(10, 5, 4)) {
			System.out.println("Values are matching");
		}
		System.out.println("variable values a=10 b=5 c=4 Applied Formula: a3 +b3 =(a+b)(a2-ab+b2)");
		System.out.println("LHS is" + methodOverLoadDemo.computeLHS(10, 5));
		System.out.println("RHS is" + methodOverLoadDemo.computeRHS(10, 5));
		if (methodOverLoadDemo.computeLHS(10, 5) == methodOverLoadDemo.computeRHS(10, 5)) {
			System.out.println("Values are matching");
		}
		// ------------------------------------------------------------------------------------------------------------//
		MathDemo mathDemo = new MathDemo();
		MathDemo.demoMethod();
		MathDemo.demoMethod();
		mathDemo.add();
		// call methods and print the result; demoMethod
		// ------------------------------------------------------------------------------------------------------------//
		MathDemo1 mathDemo1 = new MathDemo1();
		mathDemo1.add();
		System.out.println("The method in MathDemo");
		System.out.println("Value of a=10 Value of b=5");
		System.out.println("Add is" + mathDemo1.add(10, 5));
		System.out.println("Sub is" + mathDemo1.sub(10, 5));
		System.out.println("Mul is" + mathDemo1.mul(10, 5));
		System.out.println("Div is" + mathDemo1.div(10, 5));
		// call methods and print the result;
		// ------------------------------------------------------------------------------------------------------------//
		MathDemo2 mathDemo2 = new MathDemo2();
		mathDemo2.add();
		System.out.println("Value of a=10 Value of b=5");
		System.out.println("Div is" + mathDemo2.div(10, 5));
	}
}
