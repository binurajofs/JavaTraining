package com.ofs.java.swathi.day3;

public abstract class PersonDemo extends Person {
	public void printBasicInfo() {
		Person person = new Person();
		person.setName("swathi");
		person.setAge(22);
		person.setNationality("Indian");
		person.setPhone(994057546);
		person.setpresentday(90);
		person.settotalDays(90);

		System.out.println("Name:" + person.getName());
		System.out.println("Age:" + person.getAge());
		System.out.println("Nationality:" + person.getNationality());
		System.out.println("Phone:" + person.getPhone());
	}

	abstract float calculateAttendancePercent(float presentDay, float totaldays);

}
