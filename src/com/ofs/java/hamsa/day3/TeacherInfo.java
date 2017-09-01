package com.ofs.java.hamsa.day3;

public class TeacherInfo extends TeacherDemo implements TeacherSalary {

	public void calculateSalary(TeacherSalaryEntity salary) {
		try {

			salary.TotalSalary = ((salary.ctc + salary.pay) - salary.tax);
			System.out.println("TEACHER SALARY DETAILS");
			System.out.println("TEACHER TOTAL SALARY :" + salary.TotalSalary);
			System.out.println("TEACHER CTC :" + salary.ctc);
			System.out.println("TEACHER TAX :" + salary.tax);
			System.out.println("TEACHER PAY :" + salary.pay);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
