package com.ofs.java.rinosh.day3;

public class TeacherInfo extends TeacherDemo implements TeacherSalary {
	public void calculateSalary(TeacherSalaryEntity salary) {
		try {
			salary.TotalSalary = ((salary.CTC + salary.HRAllowance) - salary.Tax);
			System.out.println("TEACHER SALARY DETAILS");
			System.out.println("TEACHER TOTAL SALARY :" + salary.TotalSalary);
			System.out.println("TEACHER CTC :" + salary.CTC);
			System.out.println("TEACHER TAX :" + salary.Tax);
			System.out.println("TEACHER HRALLOWANCE :" + salary.HRAllowance);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public float calculateAttendancePercent(int presentDays, int totalDays) {
		// TODO Auto-generated method stub
		return 0;
	}

}