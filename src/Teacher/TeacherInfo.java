package Teacher;

import Entity.TeacherSalaryEntity;

public class TeacherInfo extends TeacherDemo implements TeacherSalary{

	public void calculateSalary(TeacherSalaryEntity salary) {

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
