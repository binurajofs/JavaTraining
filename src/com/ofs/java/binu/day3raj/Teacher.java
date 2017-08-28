package com.ofs.java.day3raj;

public class Teacher  extends Person {
	int employeId;
	/**
	 * @return the employeId
	 */
	public int getEmployeId() {
		return employeId;
	}
	/**
	 * @param employeId the employeId to set
	 */
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return Subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		Subject = subject;
	}
	String qualification,Subject;
}
