package com.ofs.java.rinosh.day3;

public abstract class StudentDemo extends PersonDemo {
	void printStudentInfo(Student student) {
		System.out.println("Student RollNum :" + student.getRollNum());
		System.out.println("Student ClassName:" + student.getClassName());
		System.out.println("Student Rank :" + student.getRank());
		System.out.println("Student Section :" + student.getSection());
	}

	public float calculateAttendacePercent(int presentDays, int totalDays) {
		float attendance = ((presentDays * 100) / totalDays);
		return attendance;
	}

}