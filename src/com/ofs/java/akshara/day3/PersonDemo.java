package com.ofs.java.akshara.day3;
import com.ofs.java.akshara.day3.Person;
public abstract class PersonDemo extends Person {
	public void printBasicInfo(Person person) {
		System.out.println("Name:"+person.getName());
		System.out.println("Age:"+person.getAge());
		System.out.println("Phone:"+person.getPhone());
		System.out.println("Nationality:"+person.getNationality ());
	}
	abstract float calculateAttendancePercent(int presentDays,int totalDays); 
	
}
