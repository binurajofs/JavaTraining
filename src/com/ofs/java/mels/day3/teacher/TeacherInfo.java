package com.ofs.java.mels.day3.teacher;

public class TeacherInfo extends TeacherDemo implements TeacherSalary {

	@Override
	public int calculateSalary(TeacherSalaryEntity salary) {
		// TODO Auto-generated method stub
		salary.setSalary(45000);
		
		return 0;
	}

}
