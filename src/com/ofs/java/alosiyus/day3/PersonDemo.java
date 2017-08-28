package com.ofs.java.alosiyus.day3;

public abstract class  PersonDemo {
	
 public void printBasicInfo(Person person) {
	 System.out.println("----Person Details----");
		System.out.println("Name is "+person.getName());
		System.out.println("Age is "+person.getAge());
		System.out.println("PhoneNo is "+person.getPhone());
		System.out.println("Nationality is "+person.getNationality());
 }
public abstract float calculateAttendancePercent(int presentDay, int totalDays);
}
