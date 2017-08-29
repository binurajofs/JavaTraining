package com.ofs.java.janani.day3;

public class TeacherInfo extends TeacherDemo implements TeacherSalary{
	public int calculateSalary(TeacherSalaryEntity salary) {
		TeacherDemo teach = new TeacherDemo();
		teach.printTeacherInfo();
		salary.setSalary(80000);
		System.out.println("Salaruy is:"+salary.getSalary());
		
			
			
		return 0;
	}

	@Override
	float calculateAttendancePercent(float presentDay, float totalDays) {
		// TODO Auto-generated method stub
		return 0;
	}

}
