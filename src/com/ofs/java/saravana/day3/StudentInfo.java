package com.ofs.java.saravana.day3;

public class StudentInfo extends StudentDemo implements StudentsMarks{

	@Override
	public void calcualateMark(StudentMarkEntity marks) {
		// TODO Auto-generated method stub
		
		
		
		StudentDemo studentdemo = new StudentDemo();
		studentdemo.printStudentInfo();
		marks.setPhysics(90);
		marks.setChemistry(90);
		marks.setMaths(95);
		try {
		marks.setTotal(marks.getChemistry()+marks.getPhysics()+marks.getMaths());
		marks.setAverage(marks.getTotal()/3);
		}
		catch(Exception e) {
			System.out.println("you have run time error");
		}
		System.out.println();
		System.out.println("physics mark: "+marks.getPhysics());
		System.out.println("Chemistry mark: "+marks.getChemistry());
		System.out.println("Maths mark: "+marks.getMaths());
		System.out.println("Total mark: "+marks.getTotal());
		System.out.println("Average mark: "+marks.getAverage());
		
	}

}
