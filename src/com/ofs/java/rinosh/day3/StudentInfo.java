package com.ofs.java.rinosh.day3;

public class StudentInfo extends StudentDemo implements StudentsMarks {
	public void calculateMark(StudentMarkEntity marks) {
		try {
			marks.total = marks.subject1 + marks.subject2 + marks.subject3;
			marks.average = marks.total / 3;
			System.out.println("STUDENT MARK DETAILS");
			System.out.println("STUDENT MARK IN SUBJECT 1 :" + marks.subject1);
			System.out.println("STUDENT MARK IN SUBJECT 2 :" + marks.subject2);
			System.out.println("STUDENT MARK IN SUBJECT 3 :" + marks.subject3);
			System.out.println("STUDENT TOTAL IN ALL 3 SUBJECTS :" + marks.total);
			System.out.println("STUDENT AVERAGE IN 3 SUBJECT :" + marks.average);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public float calculateAttendancePercent(int presentDays, int totalDays) {
		// TODO Auto-generated method stub
		return 0;
	}

}