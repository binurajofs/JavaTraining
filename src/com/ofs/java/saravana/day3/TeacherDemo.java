package com.ofs.java.saravana.day3;

public class TeacherDemo extends PersonDemo {
	 public void printTeacherInfo(){
		 
		 
		 System.out.println("---------------------------Teacher's personal details are------------------------");
		 Teacher teacher = new Teacher();
		 teacher.setEmployeId(21);
		 teacher.setQualification("M.E");
		 teacher.setSubject("oops");
		 teacher.setName("saravanan");
		 teacher.setAge(22);
		 teacher.setPhone("8344247711");
		 System.out.println("Employe Name : "+teacher.getName());
		 System.out.println("Age          : "+teacher.getAge());
		 System.out.println("EmployeId    : "+teacher.getEmployeId());
		 System.out.println("Qualification: "+teacher.getQualification());
		 System.out.println("Subject      : "+teacher.getSubject());
		 System.out.println("Phone        : "+teacher.getPhone());
		 	
	 }
	 public float calculateAttendancePercent(int a,int b) {
			return 0;
	  }
}
