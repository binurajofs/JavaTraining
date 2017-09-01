package com.ofs.java.swathi.day3;

public class TeacherDemo extends PersonDemo {
	public void printTeacherInfo() {
		Teacher teacher = new Teacher();
		teacher.setEmployeeid(14);
		teacher.setQualification("MCA");
		teacher.setSubject("COMPUTER SCIENCE");

		System.out.println("Employeeid:" + teacher.getEmployeeid());
		System.out.println("Qualification:" + teacher.getQualification());
		System.out.println("Subject:" + teacher.getSubject());

	}

	@Override
	float calculateAttendancePercent(float presentDay, float totalDays) {
		float percentage = (presentday / totaldays) * 100;
		return percentage;
	}

}
