package com.ofs.java.alosiyus.day3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("Alosiyus");
		person.setAge(21);
		person.setNationality("Indian");
		person.setPhone(99440017);
		
		Student student = new Student();
		student.setName("awe");
		student.setAge(21);
		student.setNationality("Indian");
		student.setPhone(98845123);
		student.setClassa(11);
		student.setSection('A');
		student.setRollNum(1424);
		student.setRank(5);
		
		Teacher teacher = new Teacher();
		teacher.setName("A");
		teacher.setAge(25);
		teacher.setNationality("Indian");
		teacher.setPhone(12345671);
		teacher.setEmployeId(1234);
		teacher.setQualification("B.E");
		teacher.setSubject("Java");
		
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.printBasicInfo(person);
		studentInfo.printStudentInfo(student);
		System.out.println("Attendance Percentage is "+studentInfo.calculateAttendancePercent(10, 20));
		
		StudentMark marks = new StudentMark();
		marks.setChemistry(50);
		marks.setPhysics(80);
		marks.setMaths(70);
		
		studentInfo.calculateMark(marks);
		
		TeacherInfo teacherInfo = new TeacherInfo();
		teacherInfo.printTeacherInfo(teacher);
		System.out.println("Attendance Percentage is"+teacherInfo.calculateAttendacePercent(10, 30));
		
		TeacherSalaryEnti salary = new TeacherSalaryEnti();
		salary.setBasicPay(15000);
		salary.setGrossSalary(24000);
		salary.setHraAllowance(2000);
		salary.setPf(3500);
		teacherInfo.calculateSalary(salary);
	}

}
