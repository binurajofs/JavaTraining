package Day3;

import Entity.Person;
import Entity.Student;
import Entity.StudentMarkEntity;
import Entity.Teacher;
import Entity.TeacherSalaryEntity;
import Student.StudentInfo;
import Teacher.TeacherInfo;

public class Day3Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("POOVARASAN");
		person.setAge(21);
		person.setPhoneNumber(1234567890);
		person.setNationality("Indian");
//----------------------------------------------//		
		Student student = new Student();
		student.setName("poovi");
		student.setAge(22);
		student.setPhoneNumber(123456789);
		student.setNationality("Indian");
		student.setStandard("B.E");
		student.setSection("ECE");
		student.setRank(3);
		student.setRollNum(1431);
//---------------------------------------------//		
		Teacher teacher = new Teacher();
		teacher.setName("BinuRaj");
		teacher.setAge(25);
		teacher.setPhoneNumber(1234567830);
		teacher.setNationality("Indian");
		teacher.setemployeeId(1001);
		teacher.setqualification("ECE");
		teacher.setSubject("JAVA");
//--------------------------------------------//
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.printBasicInfo(person);
		studentInfo.printStudentInfo(student);
		System.out.println("Attendance Percentage is"+studentInfo.calculateAttendancePercent(10,30));
//-------------------------------------------//
		StudentMarkEntity marks =new StudentMarkEntity();
		marks.setChemistry(70);
		marks.setPhysics(85);
		marks.setMaths(88);
		studentInfo.calculateMark(marks);
//-------------------------------------------//
		TeacherInfo teacherInfo = new TeacherInfo();
		teacherInfo.printTeacherInfo(teacher);
		System.out.println("Attendance Percentage is"+teacherInfo.calculateAttendancePercent(10,30));
//-------------------------------------------//
		TeacherSalaryEntity salary=new TeacherSalaryEntity();
		salary.setBasicPay(1000);
		salary.setHraAllowance(500);
		salary.setPf(2000);
		salary.setGrossSalary(59665);
		teacherInfo.calculateSalary(salary);
		
	}

}
