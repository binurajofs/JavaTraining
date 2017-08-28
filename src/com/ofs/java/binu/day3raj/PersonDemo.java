package com.ofs.java.day3raj;
import com.ofs.java.day3raj.Person;
public abstract class PersonDemo {

	public void printBasicInfo(Person person) {
		System.out.println("");
		System.out.println("Person Name :"+person.getName());
		System.out.println("Person Age :"+person.getAge());
		System.out.println("Person PhoneNo :"+person.getPhone());
		System.out.println("Person Nationality :"+person.getNationality());
	}
	
	public abstract float calculateAttendacePercent(int presentDays, int totalDays);

}
	
