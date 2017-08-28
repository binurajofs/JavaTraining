package com.ofs.java.soma.day3;

public class Teacherinfo extends TeacherDemo implements Teachersalary {

	@Override
	public void calculateSalary(Teachersalaryentity salary) {
		// TODO Auto-generated method stub
		TeacherDemo teach = new TeacherDemo();
		teach.teacherBasicInfo();
		salary.setBasicpay(5000);
		salary.setHRA(2500);
		salary.setPA(2500);
		
		System.out.println("");
		System.out.println("Teacher salary Details..");
		System.out.println("Basicpay is: "+salary.getBasicpay());
		System.out.println("HRA is: "+salary.getHRA());
		System.out.println("PA is: "+salary.getPA());
		
	try {
		salary.setTotalsalary(salary.getBasicpay()+salary.getHRA()+salary.getPA());
	}
	catch(Exception e){
		System.out.println("Error");
		
		
	}
	System.out.println("Net Salary: "+salary.getTotalsalary());
	}
	
	

}
