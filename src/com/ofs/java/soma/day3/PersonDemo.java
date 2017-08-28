package com.ofs.java.soma.day3;

abstract public class PersonDemo {

	public void printBasicInfo()
	{
		Person person= new Person();
		person.setName("Sundaresh");
		person.setPhonenumber("7598177195");
		person.setAge(21);
		person.setNationality("Indian");
		
		
		System.out.println("The Person Details Are...");
		System.out.println("Name of Person: "+person.getName());
		System.out.println("Phone Number: "+person.getPhonenumber());
		System.out.println("Perso Age: "+person.getAge());
		System.out.println("Nationality: "+person.getNationality());
		}
	
	abstract float calculateAttendancePercent(int presentDay, int totalDays);

	}


