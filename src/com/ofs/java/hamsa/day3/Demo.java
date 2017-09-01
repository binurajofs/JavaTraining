package com.ofs.java.hamsa.day3;

public class Demo {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Hamsa");
		person.setAge(21);
		person.setNationality("Indian");
		person.setPhone(1234567890);

		Student student = new Student();
		student.setName("Priya");
		student.setAge(21);
		student.setNationality("Indian");
		student.setPhone(1122334455);
		student.setRollNum(1553);
		student.setclassName("2");
        student.setRank(5);
		student.setsection1("cse");

		Teacher teacher = new Teacher();
		teacher.setName("asdfg");
		teacher.setAge(30);
		teacher.setNationality("Indian");
		teacher.setPhone(987654321);
		teacher.setemployeId(1100);
		teacher.setQualification("B.E");
		teacher.setSubject("Java");

		StudentInfo studentInfo = new StudentInfo();
		studentInfo.printBasicInfo(person);
		studentInfo.printStudentInfo(student);
		System.out.println("Attendance Percentage is "
				+ studentInfo.calculateAttendancePercent(10, 20));

		StudentMarkEntity marks = new StudentMarkEntity();
		marks.setSub1(50);
		marks.setSub2(60);
		marks.setSub3(70);

		studentInfo.calculateMark(marks);

		TeacherInfo teacherInfo = new TeacherInfo();
		teacherInfo.printTeacherInfo(teacher);
		System.out.println("Attendance Percentage is "
				+ teacherInfo.calculateAttendancePercent(10, 30));

		TeacherSalaryEntity salary = new TeacherSalaryEntity();
		salary.setTotalSalary(10000);
		salary.setTax(25000);
		salary.setPay(5000);
		salary.setCtc(2000);
		teacherInfo.calculateSalary(salary);
	}

}
