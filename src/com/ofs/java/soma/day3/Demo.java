package com.ofs.java.soma.day3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDemo persondemo = new PersonDemo() {
		float calculateAttendancePercent(int presentDay, int totalDays) {
			// TODO Auto-generated method stub
			
			return 0;
		}};
		persondemo.printBasicInfo();
	   Studentinfo studentinfo = new Studentinfo();
		Studentmarkentity marks = new Studentmarkentity();
		studentinfo.calculateMark(marks);
		
		Teacherinfo teacherinfo = new Teacherinfo();
		Teachersalaryentity salary = new Teachersalaryentity();
		teacherinfo.calculateSalary(salary);

	}

}
