package com.ofs.java.karteek.Entity;



	public class Teacher{
		public int employeId;
		public String qualification;
		public String subject;
		public Person person;
		public Teacher(int employeId, String qualification, String subject, Person person){
			this.person = person;
			this.employeId = employeId;
			this.qualification = qualification;
			this.subject = subject;
		}
	}



	

