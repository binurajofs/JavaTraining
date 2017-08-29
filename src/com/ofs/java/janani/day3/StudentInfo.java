package com.ofs.java.janani.day3;

public class StudentInfo  extends StudentDemo implements StudentMarks {
	public void calculateMark(StudentMarkEntity marks) {
		// TODO Auto-generated method stub
	
	marks.setPhysics(100);
	marks.setChemistry(98);
	marks.setScience(70);
	int total = marks.getPhysics()+marks.getChemistry()+marks.getScience();
	 float avg=total/3;
	 StudentDemo std = new StudentDemo();
	 std.printStudentInfo();
	
	 System.out.println("Physics:"+marks.getPhysics());
	 System.out.println("Chemistry:"+marks.getChemistry());
	 System.out.println("Science:"+marks.getScience());
	 System.out.println("total:"+total);
	 System.out.println("avg:"+avg);
	
	}
	

}
