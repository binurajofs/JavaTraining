package com.ofs.java.soma.day3;

public class Studentinfo extends StudentDemo implements Studentmarks {

	@Override
	public void calculateMark(Studentmarkentity marks) {
		// TODO Auto-generated method stub
		StudentDemo stud = new StudentDemo();
		stud.studentBasicInfo();
		marks.setPhysics_mark(90);
		marks.setMaths_mark(95);
		marks.setEnglish_mark(94);
		
		System.out.println("");
		System.out.println("Students Marks Are...");
		System.out.println("Physics Marks: "+marks.getPhysics_mark());
		System.out.println("Maths Mark: "+marks.getMaths_mark());
		System.out.println("English Mark: "+marks.getEnglish_mark());
	try {
		marks.setTotal(marks.getPhysics_mark()+marks.getEnglish_mark()+marks.getMaths_mark());
	marks.setAverage(marks.getTotal()/3);
	}
	catch(Exception e) {
		System.out.println("Error");
	}
	System.out.println("Total is: "+marks.getTotal());
	System.out.println("Average is: "+marks.getAverage());
	
}
                   
}
