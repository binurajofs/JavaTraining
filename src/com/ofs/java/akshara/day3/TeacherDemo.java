package com.ofs.java.akshara.day3;

public class TeacherDemo extends PersonDemo{
	float calculateAttendancePercent(int presentDays,int totalDays) {
		float val;
		val=(presentDays*100)/totalDays;
		return val;
	}
	void printTeacherInfo(Teacher teacher) {
		System.out.println("EmployeeId:"+teacher.getId());
		System.out.println("Qualification:"+teacher.getQual());
		System.out.println("Subject:"+teacher.getSub());
	}
}
