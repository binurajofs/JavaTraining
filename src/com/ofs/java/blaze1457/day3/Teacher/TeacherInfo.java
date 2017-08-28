package com.ofs.java.blaze1457.day3.Teacher;

import com.ofs.java.blaze1457.day3.entry.TeacherSalaryEntity;

/**
 * TeacherInfo extending TeacherDemo Class Implementing Teacher Salary
 * @author blaze1457
 *
 */
public class TeacherInfo extends TeacherDemo implements TeacherSalary{

	@Override
	/**
	 * Calculate salary Overriding
	 * @param object of TeacherSalaryEntity
	 */
	public void calculateSalary(TeacherSalaryEntity salary) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Basic Pay is "+salary.getBasicPay());
			System.out.println("Gross Salary is "+salary.getGrossSalary());
			System.out.println("Pf is "+salary.getPf());
			System.out.println("HRA allowance is "+salary.getHraAllowance());
			salary.ctc=salary.basicPay+salary.grossSalary+salary.pf+salary.hraAllowance;
			System.out.println("CTC is "+salary.getCtc());
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
