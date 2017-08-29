package com.ofs.java.binu.day3;

public class StudentDemo extends PersonDemo {

	public void printStudentInfo() { 
	Student student = new Student();
	student.setRollnum(21);
	student.setClas(5);
	student.setSection(2);
	student.setRank(2);
	student.setRollnum(21);
	System.out.println(" STUDENT DETAILS");
	System.out.println("roll no:" +student.getRollnum());
	System.out.println("class:" + student.getClas());
	System.out.println("section:" +student.getSection());
	System.out.println("Rank:" +student.getRank());

 }
 
public float calculateAttendancePercent(int presentDay, int totalDays) {
person k = new person(); 
float attendance =((k.presentDay*100)/k.totalDay);
	return attendance;
}
}

 

