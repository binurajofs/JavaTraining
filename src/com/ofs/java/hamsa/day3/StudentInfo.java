package com.ofs.java.hamsa.day3;

public class StudentInfo extends StudentDemo implements StudentMarks {

	public void calculateMark(StudentMarkEntity marks) {
		try {
			marks.total = marks.sub1 + marks.sub2 + marks.sub3;
			marks.average = marks.total / 3;
			System.out.println("STUDENT MARK DETAILS");
			System.out.println("STUDENT MARK IN SUBJECT 1 :" + marks.sub1);
			System.out.println("STUDENT MARK IN SUBJECT 2 :" + marks.sub2);
			System.out.println("STUDENT MARK IN SUBJECT 3 :" + marks.sub3);
			System.out.println("STUDENT TOTAL IN ALL 3 SUBJECTS :"
					+ marks.total);
			System.out
					.println("STUDENT AVERAGE IN 3 SUBJECT :" + marks.average);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
