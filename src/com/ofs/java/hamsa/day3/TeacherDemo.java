package com.ofs.java.hamsa.day3;

public class TeacherDemo extends PersonDemo {
	void printTeacherInfo(Teacher teacher) {

		System.out.println("***** TEACHER INFORMATION *****");
		System.out.println("Teacher Emp ID :" + teacher.getemployeId());
		System.out.println("Teacher Qualification:"
				+ teacher.getQualification());
		System.out.println("Teacher Subject :" + teacher.getSubject());
	}

	public float calculateAttendancePercent(int presentDays, int totalDays) {

		float attendance = ((presentDays * 100) / totalDays);
		return attendance;

	}

}
