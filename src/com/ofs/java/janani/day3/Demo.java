package com.ofs.java.janani.day3;

public class Demo {
	public static void main(String[] args) {

		PersonDemo persondemo = new PersonDemo() {
		
			float calculateAttendancePercent(float presentDay, float totalDays) {

				return 0;
			}
		};
		persondemo.printBasicInfo();

		StudentInfo studentinfo = new StudentInfo();
		StudentMarkEntity marks = new StudentMarkEntity();
		studentinfo.calculateMark(marks);

		TeacherInfo teacherinfo = new TeacherInfo();
		TeacherSalaryEntity salary = new TeacherSalaryEntity();
		teacherinfo.calculateSalary(salary);
	}
}
