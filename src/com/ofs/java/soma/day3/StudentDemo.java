package com.ofs.java.soma.day3;

public class StudentDemo extends PersonDemo {

	@Override
	float calculateAttendancePercent(int presentDay, int totalDays) {
		// TODO Auto-generated method stub
		return 0;
	}
public void studentBasicInfo()
{
	Student student = new Student();
	student.setRollnum(46);
	student.setStandard("Tenth");
	student.setSection("B");
	student.setRank(03);
	
	System.out.println("");
	System.out.println("The Student Information....");
	System.out.println("Student roll number: "+student.getRollnum());
	System.out.println("Student Standard: "+student.getStandard());
	System.out.println("Student Section: "+student.getSection());
	System.out.println("Student Rank: "+student.getRank());
	 Attendance present = new Attendance();
	 present.calculateAttendancePercent(22,22);
}

}
