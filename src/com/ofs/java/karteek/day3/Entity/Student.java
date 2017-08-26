package com.ofs.java.karteek.day3.Entity;

public class Student {



		public int rollnum;
		public String className;
		public char section;
		public int rank;
		Person person;
		public Student(int rollnum, String className, char section, int rank, Person person){
			this.person = person;
			this.rollnum = rollnum;
			this.className = className;
			this.section = section;
			this.rank = rank;
		}
	

	

	
}
