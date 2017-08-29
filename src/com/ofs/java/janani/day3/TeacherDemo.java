package com.ofs.java.janani.day3;

public class TeacherDemo extends PersonDemo {
	public void printTeacherInfo(){
		Teacher teacher = new Teacher();
		 teacher.setEmployeeid(21);
		 teacher.setQualification("BSC");
		 teacher.setSubject("COMP");
		 
		 System.out.println("Employeeid:"+teacher.getEmployeeid());
		 System.out.println("Qualification:"+teacher.getQualification());
		 System.out.println("Subject:"+teacher.getSubject());
		
	}

	@Override
	float calculateAttendancePercent(float presentDay, float totalDays) {
		// TODO Auto-generated method stub
		return 0;
	}

}
