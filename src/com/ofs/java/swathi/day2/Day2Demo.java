package day1;

public class Day2Demo {
public static void main(String args[]) {
		
		
		Methodemo  Methodemo = new Methodemo();
		
		methodDemo.add1(2,3);
		System.out.println( "addition of two numbers:" + methodDemo.add2(2,3));
		
		
		// call method one;
		// call method two and print the return value;
		
		MethodoverloadDemo MethodoverloadDemo = new MethodoverloadDemo();
		System.out.println("a3 + b3="  + MethodoverloadDemo.calculateLHS(2,3));
		System.out.println("ac + bc =" + MethodoverloadDemo.calculateLHS(2,3,6));

		System.out.println("a + b)(a2 - ab + b2) =" +  MethodoverloadDemo.calculateRHS(2,3));
		System.out.println("c(a + b) =" + MethodoverloadDemo.calculateRHS(2,3,6));
		
		int x= MethodoverloadDemo.calculateLHS(2,3);
		int y= MethodoverloadDemo.calculateRHS(2,3);
		if(x==y)
		{
			System.out.println("LHS and RHS are equal");
		}
		else
		{
			System.out.println("LHS and RHS are not equal");
		}
		int q= MethodoverloadDemo.calculateLHS(2,3,6);
		int p= MethodoverloadDemo.calculateRHS(2,3,6);
		if(q==p)
		{
			System.out.println("LHS and RHS are equal");
		}
		else
		{
			System.out.println("LHS and RHS are not equal");
		}
		// call lhs and rhs and compare the value;
		
		MathDemo mathDemo = new MathDemo();
		
		
		System.out.println("return and increment demo_number="+ MathDemo.increment());
		mathDemo.add(3,1);
		
		
		// call methods and print the result;
		MathDemo1 mathDemo1 = new MathDemo1();
		System.out.println("subtraction of two numbers is"+ mathDemo1.sub(3,1));
		System.out.println("multiplication of two numbers is"+ mathDemo1.mul(3,1));
		System.out.println("addition of two numbers is"+ mathDemo1.add(3,1));
		// call methods and print the result;
		MathDemo2 mathDemo2 = new MathDemo2();
		System.out.println("division of two numbers is"+ mathDemo2.div(3,1));

	}

}