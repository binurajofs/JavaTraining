package com.ofs.java.mels.day3;

public abstract class PersonDemo {

	public void printBasicInfo(Person person) {

		System.out.println("Name: " + person.name + "\n");
		System.out.println("Age: " + person.age + "\n");
		System.out.println("Nationality: " + person.nationality + "\n");

	}

	protected abstract float calculateAttendancePercent(float presentDay, float totalDays);
}
