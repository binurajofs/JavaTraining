package com.ofs.java.swathi.day3;

public class StudentDemo extends PersonDemo {
	public void printStudentInfo() { 
		Student student = new Student();
		student.setRollnum(59);
		student.setStandard("4");
		student.setSection('c');
		student.setRank(23);

		System.out.println("Rollnum:" + student.getRollnum());
		System.out.println("Standard:" + student.getStandard());
		System.out.println("Section:" + student.getSection());
		System.out.println("Rank:" + student.getRank());

	}

	float calculateAttendancePercent(float presentday, float totaldays) {
		float percentage = (presentday / totaldays) * 100;
		return percentage;
	}

}
