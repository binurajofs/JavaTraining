package com.ofs.java.rinosh.day3;

public abstract class TeacherDemo extends PersonDemo {
	void printTeacherInfo(Teacher teacher) {
		System.out.println("Teacher Emp ID :" + teacher.getEmployeId());
		System.out.println("Teacher Qualification:" + teacher.getQualification());
		System.out.println("Teacher Subject :" + teacher.getSubject());
	}

	public float calculateAttendacePercent(int presentDays, int totalDays) {
		float attendance = ((presentDays * 100) / totalDays);
		return attendance;
	}

}