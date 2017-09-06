package com.ofs.java.rinosh.day3;

public class TeacherSalaryEntity {
	public long TotalSalary;
	public long Tax;
	public long HRAllowance;
	public long CTC;

	public long getTotalSalary() {
		return TotalSalary;
	}

	public void setTotalSalary(long totalSalary) {
		TotalSalary = totalSalary;
	}

	public long getTax() {
		return Tax;
	}

	public void setTax(long tax) {
		Tax = tax;
	}

	public long getHRAllowance() {
		return HRAllowance;
	}

	public void setHRAllowance(long hRAllowance) {
		HRAllowance = hRAllowance;
	}

	public long getCTC() {
		return CTC;
	}

	public void setCTC(long cTC) {
		CTC = cTC;
	}

}