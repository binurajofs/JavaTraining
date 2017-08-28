package com.ofs.java.saravana.day3;

public class StudentDemo extends PersonDemo{
	  public void printStudentInfo() {
		  Student student = new Student();

			student.setRollNum(71);
			student.setClass_name("First year");
			student.setSection('A');
			student.setRank(4);
			student.setName("kannan");
			student.setAge(21);
			student.setNationality("India");
			student.setPhone("8344247711");
	    	System.out.println("---------------------------Student's personal details are------------------------          ");
	    	System.out.println("Name         : "+student.getName());
	    	System.out.println("RollNum      : "+student.getRollNum());
	    	System.out.println("Age          : "+student.getAge());
	    	System.out.println("Phone        : "+student.getPhone());
	    	System.out.println("Nationality  : "+student.getNationality());
	    	System.out.println("Class Name   : "+student.getClass_name());
	    	System.out.println("Section      : "+student. getSection());
	    	System.out.println("Rank         : "+student.getRank());
	    	Persondetail persondetail = new Persondetail();
			persondetail.calculateAttendancePercent(21, 27);
			StudentMarkEntity marks = new StudentMarkEntity(); 
	    	
	 }
	  public float calculateAttendancePercent(int a,int b) {
			return 0;
	  }
}
