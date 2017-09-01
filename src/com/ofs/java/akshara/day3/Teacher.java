package com.ofs.java.akshara.day3;

public class Teacher extends Person {
	public long id;
	public String qual;
	public String sub;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id= id;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual= qual;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub= sub;
	}
}
