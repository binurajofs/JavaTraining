package com.ofs.java.binu.day3;

abstract class PersonDemo extends person {
	public void printBasicInfo() {
		person person = new person();

		person.setName("Udaykumar");
		person.setAge(21);
		person.setPhonenumber("87990854455");
		person.setNationality("Indian");
		person.setpresentDay(85);
		person.settotalDay(100);
		System.out.println(" BASIC DETAILS OF PERSON");
		System.out.println("name:" + person.getName());
		System.out.println("age:" + person.getAge());
		System.out.println("phonenumber:" + person.getPhonenumber());
		System.out.println("Nationality:" + person.getNationality());

	}

	abstract float calculateAttendancePercent(int presentDay, int totalDays);
}
