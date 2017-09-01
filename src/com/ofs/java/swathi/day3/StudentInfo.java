package com.ofs.java.swathi.day3;

public class StudentInfo extends StudentDemo implements StudentMark {
	public void calculateMark(StudentMarkEntity marks) {
		// TODO Auto-generated method stub

		marks.setPhysics(100);
		marks.setChemistry(98);
		marks.setBiology(70);
		int total = marks.getPhysics() + marks.getChemistry() + marks.getBiology();
		float avg = total / 3;
		StudentDemo std = new StudentDemo();
		std.printStudentInfo();
		float attendancePercent = std.calculateAttendancePercent(80,100);
		System.out.println("Physics:" + marks.getPhysics());
		System.out.println("Chemistry:" + marks.getChemistry());
		System.out.println("Biology:" + marks.getBiology());
		System.out.println("total:" + total);
		System.out.println("avg:" + avg);
		System.out.println("Attendance percentage:" + attendancePercent);

	}

}
