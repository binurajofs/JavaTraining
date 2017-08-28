package com.ofs.java.saravana.day3;
public class Demo {
	public static void main(String[] args) {
		
		PersonDemo persondemo = new PersonDemo() {
			float calculateAttendancePercent(int presentDay, int totalDays) {
				return 0;
			}};
		persondemo.printBasicInfo();
			
		StudentInfo studentinfo = new StudentInfo();
		StudentMarkEntity marks = new StudentMarkEntity(); 
		studentinfo.calcualateMark(marks);
		
		TeacherInfo teacherinfo = new TeacherInfo();
		TeacherSalaryEntity salary = new TeacherSalaryEntity();
		teacherinfo.calculateSalary(salary);
	}
}
