package com.ofs.java.akshara.day3;


import  com.ofs.java.akshara.day3.Student;
import  com.ofs.java.akshara.day3.StudentInfo;
import  com.ofs.java.akshara.day3.StudentMarkEntity;
import  com.ofs.java.akshara.day3.Teacher;
import  com.ofs.java.akshara.day3.TeacherInfo;
import  com.ofs.java.akshara.day3.TeacherSalaryEntity;

public class Demo {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("Akshara");
		student.setAge(21);
		student.setPhone(2345678);
		student.setNationality("Indian");
		student.setRollNum(342);
		student.setStandard(10);
		student.setSection("A");
		student.setRank(5);
		
		StudentInfo studentinfo=new StudentInfo();
		StudentMarkEntity marks=new StudentMarkEntity();
		studentinfo.printBasicInfo(student);
		studentinfo.printStudentInfo(student);
		System.out.println("Attendance Percentage:"+studentinfo.calculateAttendancePercent(9,15));
		studentinfo.calculateMark(marks);
		
		
		Teacher teacher=new Teacher();
		teacher.setName("Akshara");
		teacher.setAge(21);
		teacher.setPhone(2345678);
		teacher.setNationality("Indian");
		teacher.setId(42);
		teacher.setQual("M.Sc,B.Ed");
		teacher.setSub("Physics");
		
		TeacherInfo teacherinfo=new TeacherInfo();
		TeacherSalaryEntity salary=new TeacherSalaryEntity();
		teacherinfo.printBasicInfo(teacher);
		teacherinfo.printTeacherInfo(teacher);
		System.out.println("Attendance Percentage:"+teacherinfo.calculateAttendancePercent(9,15));
		teacherinfo.calculateSalary(salary);
		
		
		

	}

}
