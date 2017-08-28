package com.ofs.java.vinitha.day3.entry;
/**
 * Teacher Salary Entity
 * @author vinitha
 *
 */
public class TeacherSalaryEntity {
public long grossSalary;
public long basicPay;
public long hraAllowance;
public long pf;
public long ctc;
public long getCtc() {
	return ctc;
}
public void setCtc(long ctc) {
	this.ctc = ctc;
}
public long getGrossSalary() {
	return grossSalary;
}
public void setGrossSalary(long grossSalary) {
	this.grossSalary = grossSalary;
}
public long getBasicPay() {
	return basicPay;
}
public void setBasicPay(long basicPay) {
	this.basicPay = basicPay;
}
public long getHraAllowance() {
	return hraAllowance;
}
public void setHraAllowance(long hraAllowance) {
	this.hraAllowance = hraAllowance;
}
public long getPf() {
	return pf;
}
public void setPf(long pf) {
	this.pf = pf;
}
}
