package com.ofs.java.day3raj;

public class Student extends Person {
	 /**
	 * @return the rollNum
	 */
	public int getRollNum() {
		
		return rollNum;
	}
	/**
	 * @param rollNum the rollNum to set
	 */
	public void setRollNum(int rollNum) {
		
		this.rollNum = rollNum;
	}
	/**
	 * @return the className
	 */
	public int getClassName() {
		
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(int className) {
		
		this.className = className;
	}
	/**
	 * @return the rank
	 */
	public int getRank() {
		
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		
		this.rank = rank;
	}
	/**
	 * @return the section
	 */
	public char getSection() {
		
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(char section) {
		
		this.section = section;
	}
	int rollNum,className,rank;
	 char section;
}
