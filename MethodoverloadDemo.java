package day1;

public class MethodoverloadDemo {
	public int calculateLHS(int a,int b)
	{
		return ((a*a*a)+(b*b*b));
	}
	public int calculateLHS(int a,int b,int c)
	{
		return ((a*c)+(b*c));
	}
	public int calculateRHS(int a,int b)
	{
		return ((a+b)*((a*a)-(a*b)+(b*b)));
		
	}
	public int calculateRHS(int a,int b,int c)
	{
		return (c*(a+b));
		
	}
}
