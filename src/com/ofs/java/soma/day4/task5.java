package com.ofs.java.soma.day4;

import com.ofs.java.soma.day3.*;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		try
		{
			person.setName("Somu");
			person.setAge(21);
			person.setNationality("Indian");
			
		task5 object= new task5();
		object.display(person);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Memory Management");
			System.gc();
			System.out.println("cleaned");
		}

	}
	public void display(Person person) {
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getNationality());
	}

}
