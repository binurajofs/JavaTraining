package com.ofs.java.hamsa.day3;

public class Student extends Person {

	int rollNum, rank;
	String className;
	String section;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getclassName() {
		return className;
	}

	public void setclassName(String string) {
		this.className = string;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
}