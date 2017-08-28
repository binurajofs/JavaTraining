package com.ofs.java.saravana.day3;

abstract public class PersonDemo {
    public void printBasicInfo() {
Person person = new Person();
		
		person.setName("saravanan");
		person.setAge(21);
		person.setPhone("8344247711");
		person.setNationality("India");
    
    	System.out.println("---------------------------Person's personal details are------------------------          ");
    	System.out.println("Name        : "+person.getName());
    	System.out.println("Age         : "+person.getAge());
    	System.out.println("Phone       : "+person.getPhone());
    	System.out.println("Nationality : "+person.getNationality());
    	
    }
   abstract float calculateAttendancePercent(int presentDay, int totalDays);
}
