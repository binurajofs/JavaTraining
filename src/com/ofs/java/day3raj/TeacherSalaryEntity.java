package com.ofs.java.day3raj;

public class TeacherSalaryEntity {
	public long TotalSalary;
	/**
	 * @return the totalSalary
	 */
	public long getTotalSalary() {
		return TotalSalary;
	}
	/**
	 * @param totalSalary the totalSalary to set
	 */
	public void setTotalSalary(long totalSalary) {
		TotalSalary = totalSalary;
	}
	/**
	 * @return the tax
	 */
	public long getTax() {
		return Tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(long tax) {
		Tax = tax;
	}
	/**
	 * @return the hRAllowance
	 */
	public long getHRAllowance() {
		return HRAllowance;
	}
	/**
	 * @param hRAllowance the hRAllowance to set
	 */
	public void setHRAllowance(long hRAllowance) {
		HRAllowance = hRAllowance;
	}
	/**
	 * @return the cTC
	 */
	public long getCTC() {
		return CTC;
	}
	/**
	 * @param cTC the cTC to set
	 */
	public void setCTC(long cTC) {
		CTC = cTC;
	}
	public long Tax;
	public long HRAllowance;
	public long CTC;
}
