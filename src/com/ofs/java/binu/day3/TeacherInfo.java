package com.ofs.java.binu.day3;

public class TeacherInfo extends TeacherSalaryEntity implements TeacherSalary {

	public void calculateSalary() {
		TeacherDemo t = new TeacherDemo();
		t.printTeacherInfo();
		System.out.println();

		try {
			TeacherSalaryEntity s = new TeacherSalaryEntity();
			s.setbasicpay(2000);
			s.setotherpay(1500);
			s.setHrallowance(1000);
			s.setpf(1500);

			System.out.println("TEACHER SALARY DETAILS");
			System.out.println("Basicpay :" + s.basicpay);
			System.out.println("Otherpay:" + s.otherpay);
			System.out.println("Hrallowance :" + s.Hrallowance);
			System.out.println("Pf :" + s.pf);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}