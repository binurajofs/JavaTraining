package com.ofs.java.kannan.day3.entity;

/**
 * Teacher Class
 * @author KannaN
 *
 */
public class Teacher extends Person{
	int empId;
	String qualification;
	String subject;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
