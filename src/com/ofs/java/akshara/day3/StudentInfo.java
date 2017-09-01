package com.ofs.java.akshara.day3;
import com.ofs.java.akshara.day3.StudentMarkEntity;

public class StudentInfo extends StudentDemo implements StudentsMarks {
	public void calculateMark(StudentMarkEntity marks) {
		try {
		System.out.println("Physics:" +marks.mark1);
		System.out.println("Chemistry:" +marks.mark2);
		System.out.println("Maths:" +marks.mark3);
		System.out.println("Total:" +marks.avg());
	}
		catch(Exception e) {
			System.out.println("exception"+e);
		}
		}

}
