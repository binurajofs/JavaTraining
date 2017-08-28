package com.ofs.java.alosiyus.day3;

public class StudentInfo extends StudentDemo implements StudentMarks {
	public void calculateMark(StudentMark marks) {
		// TODO Auto-generated method stub
		try {
			marks.total=marks.physics+marks.chemistry+marks.maths;
			marks.average=marks.total/3;
			System.out.println("Mark in Chemistry is "+marks.getChemistry());
			System.out.println("Mark in physics is "+marks.getPhysics());
			System.out.println("Mark in Maths is "+marks.getMaths());
			System.out.println("total is "+marks.getTotal());
			System.out.println("Average is "+marks.getAverage());
			
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
}
}