package com.ofs.java.hamsa.day3;

public class TeacherSalaryEntity {
	public long TotalSalary;
	public long tax;
	public long ctc;
	public long pay;

	public long getTotalSalary() {
		return TotalSalary;
	}

	public void setTotalSalary(long totalSalary) {
		TotalSalary = totalSalary;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getCtc() {
		return ctc;
	}

	public void setCtc(long ctc) {
		this.ctc = ctc;
	}

	public long getPay() {
		return pay;
	}

	public void setPay(long pay) {
		this.pay = pay;
	}

}
