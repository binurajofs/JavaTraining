package com.ofs.java.soma.day3;

public class Attendance extends PersonDemo {
	
	@Override
	float calculateAttendancePercent(int presentDay, int totalDays) {
		// TODO Auto-generated method stub
		int percentage = ((presentDay*100)/totalDays);
		System.out.println("Attendance percentage: "+percentage);
		return 0;
	}
         
}

