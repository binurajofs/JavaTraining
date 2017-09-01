package com.ofs.java.swathi.day3;

public class TeacherInfo extends TeacherDemo implements TeacherSalary {
	public int calculateSalary(TeacherSalaryEntity salary) {
		TeacherDemo teach = new TeacherDemo();
		teach.printTeacherInfo();
		salary.setSalary(20000);
		System.out.println("Salary is:" + salary.getSalary());

		return 0;
	}

	@Override
	float calculateAttendancePercent(float presentDay, float totalDays) {
		float percentage = (presentday / totaldays) * 100;
		return percentage;
	}

}
