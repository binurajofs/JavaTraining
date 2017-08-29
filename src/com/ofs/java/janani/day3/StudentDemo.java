package com.ofs.java.janani.day3;

public class StudentDemo {
	public void printStudentInfo(){
		Student student = new Student();
		 student.setRollnum(5);
		 student.setStandard("vi");
		 student.setSection('A');
		 student.setRank(10);
		 
		 System.out.println("Rollnum:"+student.getRollnum());
	     System.out.println("Standard:"+student.getStandard());
		 System.out.println("Section:"+student.getSection());
		 System.out.println("Rank:"+student.getRank());
		 
		}
	float calculateAttendancePercent(float presentDay, float totalDays) {
		float percentage=(presentDay/totalDays)*100;
		return percentage;
	}
}
