package com.ofs.java.karteek.day3;

import com.ofs.java.karteek.day3.Entity.Person;
import com.ofs.java.karteek.day3.Entity.Student;
import com.ofs.java.karteek.day3.Entity.StudentMarkEntity;
import com.ofs.java.karteek.day3.Entity.Teacher;
import com.ofs.java.karteek.day3.Entity.TeacherSalaryEntity;

abstract class PersonDemo{
	
	void printBasicInfo(Person person){
		System.out.println("Name is : "+person.name);
		System.out.println("Age is : "+person.age);
		System.out.println("Phone is : "+person.phone);
		System.out.println("Nationality is : "+person.nationality);
	}
	
	abstract void calculateAttendancePercent(int presentDays, int totalDays);
}

class StudentDemo extends PersonDemo{
	
	final void printStudentInfo(Student student){
		System.out.println("Roll number is : "+student.rollnum);
		System.out.println("Class Name is : "+student.className);
		System.out.println("Section is : "+student.section);
		System.out.println("Rank is : "+student.rank);
	}

	void calculateAttendancePercent(int presentDays, int totalDays){
		int attendancePercent = (presentDays*100)/totalDays;
		System.out.println("Attendance Percent of student is : "+attendancePercent);
	}
}

class TeacherDemo extends PersonDemo{

	
	final void printTeacherInfo(Teacher teacher){
		System.out.println("Employee Id is : "+teacher.employeId);
		System.out.println("Qualification is : "+teacher.qualification);
		System.out.println("Subject is : "+teacher.subject);
	}
	
	void calculateAttendancePercent(int presentDays, int totalDays){
		int attendancePercent = (presentDays*100)/totalDays;
		System.out.println("Attendance Percent of teacher is : "+attendancePercent);
	}
}



interface StudentMarks{
	
	void calculateMark(StudentMarkEntity marks);
}

interface TeacherSalary{
	
	void calculateSalary(TeacherSalaryEntity salary);
}

class StudentInfo extends StudentDemo implements StudentMarks{
	StudentMarkEntity marks;
	public void calculateMark(StudentMarkEntity marks){
		this.marks = marks;
		System.out.println("Subject 1 : "+marks.sub1);
		System.out.println("Subject 2 : "+marks.sub2);
		System.out.println("Subject 3 : "+marks.sub3);
		int totalMarks = (marks.sub1 + marks.sub2 + marks.sub3);
		System.out.println("Student total marks is : "+totalMarks);
	
	}
}

class TeacherInfo extends TeacherDemo implements TeacherSalary{
	TeacherSalaryEntity salary;
	public void calculateSalary(TeacherSalaryEntity salary){
		this.salary = salary;
		System.out.println("Day 1 salary: "+salary.day1);
		System.out.println("Day 2 salary : "+salary.day2);
		System.out.println("Day 3 salary : "+salary.day3);
		int totalSalary = (salary.day1 + salary.day2 + salary.day3);
		System.out.println("Teacher total salary is : "+totalSalary);
	}
}
	
class Demo{
	public static void main(String args[]){	
		Person person1 = new Person("Karthik", 23, 9874561230L, "Indian");
		Student student1 = new Student(12, "ECE", 'B', 5, person1);
		Person person2 = new Person("Krishna", 43, 6547891230L, "American");
		Teacher teacher1 = new Teacher(1429, "Btech", "Maths", person2);
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.printBasicInfo(person1);
		studentInfo.printStudentInfo(student1);
		studentInfo.calculateAttendancePercent(52,80);
		StudentMarkEntity studentMarkEntity = new StudentMarkEntity(23,24,25);
		TeacherSalaryEntity teacherSalaryEntity = new TeacherSalaryEntity(1200,1000,1100);	
		studentInfo.calculateMark(studentMarkEntity);
		System.out.println("");
		TeacherInfo teacherInfo = new TeacherInfo();
		teacherInfo.printBasicInfo(person2);
		teacherInfo.printTeacherInfo(teacher1);
		teacherInfo.calculateAttendancePercent(62,90);
		teacherInfo.calculateSalary(teacherSalaryEntity);
	}
}