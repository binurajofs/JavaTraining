package com.ofs.java.vini.day3;
import com.ofs.java.vini.day3.Person;
public abstract class PersonDemo {

	public void printBasicInfo(Person person) {
		System.out.println("");
		System.out.println("Person Name :"+person.getName());
		System.out.println("Person Age :"+person.getAge());
		System.out.println("Person PhoneNo :"+person.getPhoneNo());
		System.out.println("Person Nationality :"+person.getNationality());
	}
	
	public abstract float calculateAttendacePercent(int presentDays, int totalDays);

	public void calculateMark(TeacherSalaryEntity salary) {
		// TODO Auto-generated method stub
		
	}

	public void calculateMark(StudentMarkEntity marks) {
		// TODO Auto-generated method stub
		
	}

}
	
