package com.ofs.java.day3raj;
import com.ofs.java.day3raj.TeacherDemo;
import com.ofs.java.day3raj.TeacherSalary;

public class TeacherInfo  extends TeacherDemo implements TeacherSalary {

	
	public void calculateSalary(TeacherSalaryEntity salary) {
		try {
		// TODO Auto-generated method stub
		salary.TotalSalary=((salary.CTC+salary.HRAllowance)-salary.Tax);
		System.out.println("TEACHER SALARY DETAILS");
		System.out.println("TEACHER TOTAL SALARY :"+salary.TotalSalary);
		System.out.println("TEACHER CTC :"+salary.CTC );
		System.out.println("TEACHER TAX :"+salary.Tax);
		System.out.println("TEACHER HRALLOWANCE :"+salary.HRAllowance);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}	
	}

}
