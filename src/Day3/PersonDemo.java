package Day3;

import Entity.Person;

public abstract class PersonDemo {
	public void printBasicInfo(Person person) {
	System.out.println("PERSON DETAILS");
	System.out.println("NAME:" +person.getName());
	System.out.println("AGE:" +person.getAge());
	System.out.println("PHONE NUMBER:" +person.getPhoneNumber());
	System.out.println("NATIONALITY:" +person.getNationality());
	}
	
	public abstract float calculateAttendancePercent(int presentDays, int totalDays);

}
