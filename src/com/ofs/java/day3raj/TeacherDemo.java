package com.ofs.java.day3raj;
import com.ofs.java.day3raj.Teacher;
import com.ofs.java.day3raj.PersonDemo;

public class TeacherDemo extends PersonDemo {
	
	void printTeacherInfo(Teacher teacher){
		System.out.println("************** TEACHER INFORMATION *****************");
		System.out.println("Teacher Emp ID :"+teacher.getEmployeId());
		System.out.println("Teacher Qualification:"+teacher.getQualification());
		System.out.println("Teacher Subject :"+teacher.getSubject());
	}

	@Override
	public float calculateAttendacePercent(int presentDays, int totalDays) {
		float attendance =((presentDays*100)/totalDays);
		return attendance;
	}

	

}
