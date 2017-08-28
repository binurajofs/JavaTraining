package com.ofs.java.saravana.day3;

public class TeacherInfo extends TeacherDemo implements TeacherSalary{

	@Override
	public void calculateSalary(TeacherSalaryEntity salary) {
		// TODO Auto-generated method stub
		TeacherDemo teacherdemo = new TeacherDemo();
		 teacherdemo.printTeacherInfo();
		salary.setSalary(20000);
		salary.setPf(2000);
		salary.setGrosspay(salary.getSalary()-salary.getPf());
		System.out.println();
		System.out.println("Total salary: "+salary.getSalary());
		System.out.println("Pf          : "+salary.getPf());
		System.out.println("Grosspay    : "+salary.getGrosspay());
	}

}
