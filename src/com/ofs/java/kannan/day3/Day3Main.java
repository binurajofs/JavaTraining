package com.ofs.java.kannan.day3;

import com.ofs.java.kannan.day3.entity.Person;
import com.ofs.java.kannan.day3.entity.Student;
import com.ofs.java.kannan.day3.entity.StudentMarkEntity;
import com.ofs.java.kannan.day3.entity.Teacher;
import com.ofs.java.kannan.day3.entity.TeacherSalaryEntity;
import com.ofs.java.kannan.day3.student.StudentInfo;
import com.ofs.java.kannan.day3.teacher.TeacherInfo;

/**
 * Main Class
 * @author KannaN
 *
 */
public class Day3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("Saravana");
		person.setAge(21);
		person.setNationality("Indian");
		person.setPhoneNo(1234567890);
		
		Student student = new Student();
		student.setName("Kannan");
		student.setAge(21);
		student.setNationality("Indian");
		student.setPhoneNo(812222145);
		student.setClassName("B.Tech");
		student.setSection("IT");
		student.setRollno(1438);
		student.setRank(5);
		
		Teacher teacher = new Teacher();
		teacher.setName("Binu");
		teacher.setAge(25);
		teacher.setNationality("Indian");
		teacher.setPhoneNo(987654321);
		teacher.setEmpId(1100);
		teacher.setQualification("B.E");
		teacher.setSubject("Java");
		
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.printBasicInfo(person);
		studentInfo.printStudentInfo(student);
		System.out.println("Attendance Percentage is "+studentInfo.calculateAttendacePercent(10, 20));
		
		StudentMarkEntity marks = new StudentMarkEntity();
		marks.setChemistry(50);
		marks.setPhysics(60);
		marks.setMaths(70);
		
		studentInfo.calculateMark(marks);
		
		TeacherInfo teacherInfo = new TeacherInfo();
		teacherInfo.printTeacherInfo(teacher);
		System.out.println("Attendance Percentage is"+teacherInfo.calculateAttendacePercent(10, 30));
		
		TeacherSalaryEntity salary = new TeacherSalaryEntity();
		salary.setBasicPay(10000);
		salary.setGrossSalary(25000);
		salary.setHraAllowance(5000);
		salary.setPf(2000);
		teacherInfo.calculateSalary(salary);
	}

}
