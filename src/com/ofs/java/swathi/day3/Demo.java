package com.ofs.java.swathi.day3;

public class Demo {
	public static void main(String[] args) {

		StudentInfo studentinfo = new StudentInfo();
		StudentMarkEntity marks=new StudentMarkEntity();
		studentinfo.calculateMark(marks);

		TeacherInfo teacherinfo = new TeacherInfo();
		TeacherSalaryEntity salary=new TeacherSalaryEntity();
		teacherinfo.calculateSalary(salary);
	}
}
