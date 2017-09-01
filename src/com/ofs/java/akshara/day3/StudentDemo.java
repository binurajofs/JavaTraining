package com.ofs.java.akshara.day3;

public class StudentDemo extends PersonDemo {
	float calculateAttendancePercent(int presentDays,int totalDays) {
		float val;
		val=(presentDays*100)/totalDays;
		return val;
	}
	void printStudentInfo(Student student) {
		System.out.println("Roll no.:"+student.getRollNum());
		System.out.println("Class:"+student.getStandard());
		System.out.println("Section:"+student.getSection());
		System.out.println("Rank:"+student.getRank());
	}

}
