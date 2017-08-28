package com.ofs.java.alosiyus.day3;

public class TeacherDemo {
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
		System.out.println("PhoneNo is "+teacher.getPhone());
		System.out.println("Nationality is "+teacher.getNationality());
		System.out.println("Employee Id is "+teacher.getEmployeId());
		System.out.println("Qualification is "+teacher.getQualification());
		System.out.println("Subject is "+teacher.getSubject());
		
		
	}
}
