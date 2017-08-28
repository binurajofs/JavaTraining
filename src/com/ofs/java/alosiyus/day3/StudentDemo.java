package com.ofs.java.alosiyus.day3;


public class StudentDemo extends PersonDemo{
	
	public float calculateAttendancePercent(int presentDay, int totalDays) {
		// TODO Auto-generated method stub
		float percent = ((presentDay*100)/totalDays);
		return percent;
	}
	void printStudentInfo(Student student){
		System.out.println("----Student Details----");
		System.out.println("Name is "+student.getName());
		System.out.println("Age is "+student.getAge());
		System.out.println("PhoneNo is "+student.getPhone());
		System.out.println("Nationality is "+student.getNationality());
		System.out.println("Roll no is "+student.getRollNum());
		System.out.println("Rank is "+student.getRank());
		System.out.println("Class is "+student.getClassa());
		System.out.println("Section is "+student.getSection());
	}
		
	}
	
	
	
	

