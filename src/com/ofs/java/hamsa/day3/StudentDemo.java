package com.ofs.java.hamsa.day3;

public class StudentDemo extends PersonDemo {

	void printStudentInfo(Student student) {
		System.out.println("***STUDENT INFORMATION ****");
		System.out.println("Student RollNum :" + student.getRollNum());
		System.out.println("Student ClassName:" + student.getclassName());
		System.out.println("Student Rank :" + student.getRank());
		System.out.println("Student Section :" + student.getsection());
	}

	public float calculateAttendancePercent(int presentDays, int totalDays) {
		float attendance = ((presentDays * 100) / totalDays);
		return attendance;
	}
}
