package com.ofs.java.blaze1457.day3.Student;

import com.ofs.java.blaze1457.day3.PersonDemo;
import com.ofs.java.blaze1457.day3.entry.Student;

public class StudentDemo extends PersonDemo{

	@Override
	/**
	 * CalculateAttendancePercent of Student
	 * @param presentDays
	 * @param totalDays
	 */
	public float calculateAttendacePercent(int presentDays, int totalDays) {
		// TODO Auto-generated method stub
		float percent = ((presentDays*100)/totalDays);
		return percent;
	}
	
	/**
	 * Prints Student class object info
	 * @param student
	 */
	public void printStudentInfo(Student student) {
		System.out.println("----Student Details----");
		System.out.println("Name is "+student.getName());
		System.out.println("Age is "+student.getAge());
		System.out.println("PhoneNo is "+student.getPhoneNo());
		System.out.println("Nationality is "+student.getNationality());
		System.out.println("Roll no is "+student.getRollno());
		System.out.println("Rank is "+student.getRank());
		System.out.println("Class is "+student.getClassName());
		System.out.println("Section is "+student.getSection());
	}

}
