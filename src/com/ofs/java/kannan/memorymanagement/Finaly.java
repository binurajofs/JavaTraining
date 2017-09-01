package com.ofs.java.kannan.memorymanagement;
import com.ofs.java.kannan.day3.entity.*;

public class Finaly {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		try {
			person1.setAge(10);
			person1.setName("Kannan");
			person1.setNationality("Indian");
			person1.setPhoneNo(988888884);
			
			person2.setAge(15);
			person2.setName("Saravana");
			person2.setNationality("Indian");
			person2.setPhoneNo(988887884);
			
			Finaly object = new Finaly();
			object.display(person1);
			object.display(person2);
			
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally{
			System.out.println("Memory Management");
			System.gc();
			System.out.println("Cleaned");
		}
		
	}
	public void display(Person person) {
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println(person.getNationality());
		System.out.println(person.getPhoneNo());
	}

}
