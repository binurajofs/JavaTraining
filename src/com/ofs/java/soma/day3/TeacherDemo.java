package com.ofs.java.soma.day3;

public class TeacherDemo extends PersonDemo {
	
	@Override
	float calculateAttendancePercent(int presentDay, int totalDays) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		public void teacherBasicInfo()
		{
			Teacher teacher = new Teacher();
			teacher.setEmployeeid(330);
			teacher.setQualification("B.Sc");
			teacher.setSubject("English");
			
			System.out.println("");
			System.out.println("Teacher Details are...");
			System.out.println("Teacher's Employee id: "+teacher.getEmployeeid());
			System.out.println("Teacher's Qualification: "+teacher.getQualification());
			System.out.println("Teacher's Subject: "+teacher.getSubject());
		}
	}


