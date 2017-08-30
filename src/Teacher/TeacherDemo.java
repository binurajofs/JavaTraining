package Teacher;

import Day3.PersonDemo;
import Entity.Teacher;

public class TeacherDemo extends PersonDemo {

	@Override
	public float calculateAttendancePercent(int presentDays, int totalDays) {
		
		// TODO Auto-generated method stub
		float percent =((presentDays*100)/totalDays);
		return percent;
	}

	public void printTeacherInfo(Teacher teacher) {
		System.out.println("TEACHER DETAILS");
		System.out.println("NAME:"+teacher.getName());
		System.out.println("AGE:"+teacher.getAge());
		System.out.println("PHONE NUMBER:"+teacher.getPhoneNumber());
		System.out.println("NATIONALITY:"+teacher.getNationality());
		System.out.println("EMPLOYEE ID:"+teacher.getemployeeId());
		System.out.println("QUALIFICATION"+teacher.getqualification());
		System.out.println("SUBJECT:"+teacher.getSubject());
			}
}