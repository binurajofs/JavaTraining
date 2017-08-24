package com.ofs.java.mels.day3;
import com.ofs.java.mels.day3.*;
import com.ofs.java.mels.day3.teacher.Teacher;
import com.ofs.java.mels.day3.teacher.TeacherInfo;
import com.ofs.java.mels.day3.teacher.TeacherSalaryEntity;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Objects for Teacher and Student
 */
		StudentInfo student=new StudentInfo();
		TeacherInfo teacher=new TeacherInfo();
		
/*
 * Student informations
 */
	

	StudentMarkEntity sme = new StudentMarkEntity();
	TeacherSalaryEntity tse=new TeacherSalaryEntity();

	Student studentObj = new Student();
	studentObj.setName("Melwyn");
	studentObj.setAge(22);
	studentObj.setNationality("Indian");
	studentObj.setRank(1);
	studentObj.setStandard(17);
	studentObj.setRollNum(39);
	studentObj.setSection("A");
	student.printBasicInfo(studentObj);
	student.printStudentInfo(studentObj);
	
	System.out.println("mark: "+student.calculateMark(sme));
	System.out.println(student.calculateAttendancePercent(4, 50)+"%");
	
/*
 * Teacher informations
 */
	Teacher teacherObj=new Teacher();
	
	teacherObj.setName("Melwyn");
	teacherObj.setAge(22);
	teacherObj.setNationality("Indian");
	teacherObj.setEmployeId(1441);
	teacherObj.setQualification("Engineer");
	teacherObj.setSubject("Computer Science");
	teacher.printBasicInfo(teacherObj);
	teacher.printTeacherInfo(teacherObj);
	teacher.calculateAttendancePercent(45, 50);
	
	teacher.calculateSalary(tse);
	
	
	}

}
