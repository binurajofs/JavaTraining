package com.ofs.java.hamsa.day3;

public abstract class PersonDemo {

	public void printBasicInfo(Person person) {
		System.out.println("");
		System.out.println("Person Name :" + person.getName());
		System.out.println("Person Age :" + person.getAge());
		System.out.println("Person PhoneNo :" + person.getPhone());
		System.out.println("Person Nationality :" + person.getNationality());

	}

	public abstract float calculateAttendancePercent(int presentDays,
			int totalDays);
}
