package com.ofs.java.sindhura.day3;
import com.ofs.java.sindhura.day3.entity.Person;

/**
 * Abstract class PersonDemo
 * @author sindhura
 *
 */
public abstract class PersonDemo 
{
		/**
		 * Function to print details of Person Class objects
		 * @param person
		 */
		public void printBasicInfo(Person person) 
		{
				System.out.println("----Person Details----");
				System.out.println("Name is "+person.getName());
				System.out.println("Age is "+person.getAge());
				System.out.println("PhoneNo is "+person.getPhoneNo());
				System.out.println("Nationality is "+person.getNationality());
		}
		/**
		 * abstract method to calculate Attendance Percent
		 * @return
		 */
		public abstract float calculateAttendacePercent(int presentDays, int totalDays);
}
