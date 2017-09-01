package com.ofs.java.akshara.day3;

public class Student extends Person{
	public int rollNum;
	public int standard;
	public String section;
	public int rank;
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum=rollNum;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard= standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section= section;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank= rank;
	}
}
