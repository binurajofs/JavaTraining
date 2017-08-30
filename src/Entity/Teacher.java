package Entity;

public class Teacher extends Person {
	public int employeeId;
	public String qualification;
	public String subject;
	public int getemployeeId() {
		return employeeId;
	}
	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getqualification() {
		return qualification;
			}
	public void setqualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
