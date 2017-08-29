package com.ofs.java.binu.day3;

public class TeacherDemo extends PersonDemo {

	public void printTeacherInfo() {
		Teacher teacher = new Teacher();
		teacher.setEmployeid(1433);
		teacher.setQualification("BTECH");
		teacher.setSubject("Math");
		System.out.println("DETAILS OF TEACHER");
		System.out.println("Employeid:" + teacher.getEmployeid());
		System.out.println("Qualification:" + teacher.getQualification());
		System.out.println("Subject:" + teacher.getSubject());

	}

	float calculateAttendancePercent(int presentDay, int totalDay) {
		person k = new person();
		float attendance = ((k.presentDay * 100) / k.totalDay);
		return attendance;
	}
}