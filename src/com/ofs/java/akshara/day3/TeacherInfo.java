package com.ofs.java.akshara.day3;

public class TeacherInfo extends TeacherDemo implements TeacherSalary {
	public void calculateSalary(TeacherSalaryEntity salary) {
		System.out.println("Salary:" +salary.salary);
		System.out.println("Incentive:" +salary.incentive);
		System.out.println("Total:" +salary.total());
}
}