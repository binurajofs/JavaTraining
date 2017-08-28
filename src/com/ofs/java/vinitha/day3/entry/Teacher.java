package com.ofs.java.vinitha.day3.entry;

/**
 * Teacher Class
 * @author vinitha
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
