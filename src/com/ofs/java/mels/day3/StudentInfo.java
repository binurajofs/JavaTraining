package com.ofs.java.mels.day3;

public class StudentInfo extends  StudentDemo implements StudentsMarks {

	
	@Override
	public int calculateMark(StudentMarkEntity marks) {
		// TODO Auto-generated method stub
	
	marks.setMark1(50);
	marks.setMark2(78);
	marks.setMark3(95);
	int totalMark=marks.getMark1()+marks.getMark2()+marks.getMark3();
	return totalMark;
	}

}
