package Student;

import Day3.PersonDemo;
import Entity.Student;

public abstract class StudentDemo extends PersonDemo {

	@Override
	public float calculateAttendancePercent(int presentDays, int totalDays) {
		// TODO Auto-generated method stub
		float percent =((presentDays*100)/totalDays);
		return percent;
	}
	public void printStudentInfo(Student student) {
		System.out.println("STUDENT DETAILS");
		System.out.println("NAME:"+student.getName());
		System.out.println("AGE:"+student.getAge());
		System.out.println("PHONE NUMBER:"+student.getPhoneNumber());
		System.out.println("NATIONALITY:"+student.getNationality());
		System.out.println("ROLL NUMBER:"+student.getRollNum());
		System.out.println("RANK:"+student.getRank());
		System.out.println("STANDARD:"+student.getStandard());
		System.out.println("SECTION:"+student.getSection());
	}
}





