package com.ofs.java.mels.day3;

public class StudentDemo extends PersonDemo {

	void printStudentInfo(Student student) {
	
		/*student.setName("Melwyn");
		student.setAge(22);
		student.setNationality("Indian");
		student.setRank(1);
		student.setStandard(17);
		student.setRollNum(39);*/
		

		System.out.println("Standard: " + student.getStandard());
		System.out.println("Section: " + student.getSection());
		System.out.println("RollNum: " + student.getRollNum());
		System.out.println("Rank: " + student.getRank());

	}

	@Override
	protected 	float calculateAttendancePercent(float presentDay, float totalDays) {
		// TODO Auto-generated method stub
		float percentage=(presentDay/totalDays)*100;
		return percentage;
	}

}
