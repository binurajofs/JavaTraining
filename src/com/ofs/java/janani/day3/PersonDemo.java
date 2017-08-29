package com.ofs.java.janani.day3;

public abstract class PersonDemo {
	public void printBasicInfo(){
		Person person = new Person();
		person.setName("janani");
		person.setAge(21);
		person.setNationality("Indian");
		person.setPhone(759846751);
		
		System.out.println("Name:"+person.getName());
		System.out.println("Age:"+person.getAge());
		System.out.println("Nationality:"+person.getNationality());
		System.out.println("Phone:"+person.getPhone());
	}
	abstract float calculateAttendancePercent(float presentDay, float totalDays);

}
