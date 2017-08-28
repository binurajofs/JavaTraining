package com.ofs.java.vinitha.day3.Entry;

/**
 * Student Class
 * @author vinitha
 *
 */
public class Student extends Person{
	long rollno;
	String className;
	String section;
	int rank;
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
