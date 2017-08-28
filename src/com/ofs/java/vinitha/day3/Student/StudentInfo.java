package com.ofs.java.vinitha.day3.Student;

import com.ofs.java.vinitha.day3.entry.StudentMarkEntity;

/**
 * StudentInfo Extending StudentDemo class and implementing StudentMarks Interface
 * @author vinitha
 *
 */
public class StudentInfo extends StudentDemo implements StudentMarks{

	@Override
	/**
	 * calculateMark Overriding
	 * @param object of StudentMarkEntity
	 */
	public void calculateMark(StudentMarkEntity marks) {
		// TODO Auto-generated method stub
		try {
			marks.total=marks.physics+marks.chemistry+marks.maths;
			marks.average=marks.total/3;
			System.out.println("Mark in Chemistry is "+marks.getChemistry());
			System.out.println("Mark in physics is "+marks.getPhysics());
			System.out.println("Mark in Maths is "+marks.getMaths());
			System.out.println("total is "+marks.getTotal());
			System.out.println("Average is "+marks.getAverage());
			
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
