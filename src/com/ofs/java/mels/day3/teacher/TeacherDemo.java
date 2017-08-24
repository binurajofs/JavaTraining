package com.ofs.java.mels.day3.teacher;

import com.ofs.java.mels.day3.PersonDemo;

public class TeacherDemo extends PersonDemo {
	public void printTeacherInfo(Teacher teacher) {
		
	
		
		System.out.println("employeId: " + teacher.getEmployeId());
		System.out.println("qualification: " + teacher.getQualification());

		System.out.println("subject: " + teacher.getSubject());

	}

	@Override
	public float calculateAttendancePercent(float presentDay, float totalDays) {
		// TODO Auto-generated method stub
		
		float percentage=(presentDay/totalDays)*100;
		return percentage;
	}

}
