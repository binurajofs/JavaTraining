package com.ofs.java.day3raj;
import com.ofs.java.day3raj.StudentMarks;
public class Demo {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person person = new Person();
			person.setName("RAJKAMAL");
			person.setAge(20);
			person.setNationality("INDIAN");
			person.setPhone(737344100);
			
			Student student = new Student();
			student.setClassName(12);
			student.setSection('B');
			student.setRollNum(135106);
			student.setRank(2);
			
			Teacher teacher = new Teacher();
				teacher.setEmployeId(1437);
			teacher.setQualification("B.E");
			teacher.setSubject("WEB TECHNOLOGY");
			
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.printBasicInfo(person);
			studentInfo.printStudentInfo(student);
			System.out.println("Attendance Percentage is "+studentInfo.calculateAttendacePercent(10, 20));
			
			StudentMarkEntity marks = new StudentMarkEntity();
			marks.setSubject1(60);
			marks.setSubject2(85);
			marks.setSubject3(90);
			
			studentInfo.calculateMark(marks);
			
			TeacherInfo teacherInfo = new TeacherInfo();
			teacherInfo.printTeacherInfo(teacher);
			System.out.println("Attendance Percentage is"+teacherInfo.calculateAttendacePercent(10, 30));
			
			TeacherSalaryEntity salary = new TeacherSalaryEntity();
			salary.setTax(24000);
			salary.setHRAllowance(2000);
			salary.setCTC(3500);
			teacherInfo.calculateSalary(salary);
		}
		
	}


