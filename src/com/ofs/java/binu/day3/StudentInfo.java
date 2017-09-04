package com.ofs.java.binu.day3;

public class StudentInfo extends StudentMarkEntity implements StudentsMarks {

	public void calculateMark() {
		StudentDemo s = new StudentDemo();
		s.printStudentInfo();
		System.out.println();
		s.printBasicInfo();
		System.out.println();

		try {

			StudentMarkEntity marks = new StudentMarkEntity();
			marks.setSubject1(70);
			marks.setSubject2(80);
			marks.setSubject3(80);
			marks.total = marks.subject1 + marks.subject2 + marks.subject3;
			System.out.println("STUDENT MARK DETAILS");
			System.out.println("STUDENT MARK IN SUBJECT 1 :" + marks.subject1);
			System.out.println("STUDENT MARK IN SUBJECT 2 :" + marks.subject2);
			System.out.println("STUDENT MARK IN SUBJECT 3 :" + marks.subject3);
			System.out.println("STUDENT TOTAL IN ALL 3 SUBJECTS :" + marks.total);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
