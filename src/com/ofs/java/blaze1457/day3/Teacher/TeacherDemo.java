package com.ofs.java.blaze1457.day3.Teacher;

import com.ofs.java.blaze1457.day3.PersonDemo;
import com.ofs.java.blaze1457.day3.entry.Teacher;

/**
 * TeacherDemo class extending Person Abstract class
 * @author blaze1457
 *
 */
public class TeacherDemo extends PersonDemo {

	/**
	 * overriding abstract methods
	 */
	@Override
	public float calculateAttendacePercent(int presentDays, int totalDays) {
		// TODO Auto-generated method stub
		float percent = ((presentDays*100)/totalDays);
		return percent;
	}
	
	/**
	 * Prints Teacher class object info
	 * @param teacher
	 */
	public void printTeacherInfo(Teacher teacher) {
		System.out.println("----Teacher Details----");
		System.out.println("Name is "+teacher.getName());
		System.out.println("Age is "+teacher.getAge());
		System.out.println("PhoneNo is "+teacher.getPhoneNo());
		System.out.println("Nationality is "+teacher.getNationality());
		System.out.println("Employee Id is "+teacher.getEmpId());
		System.out.println("Qualification is "+teacher.getQualification());
		System.out.println("Subject is "+teacher.getSubject());
		
		
	}

}
