package com.ofs.java.janani.day4;

import com.ofs.java.janani.day3.Person;

public class Finaly {
	
		public static void main(String args[]){
		    Person person = new Person();
			try{
				person.setName("janani");
				person.setAge(21);
				person.setNationality("Indian");
				person.setPhone(759846751);
				
				Finaly object=new Finaly();
				object.display(person);
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			finally{
				System.out.println("janani");
				System.gc();
				System.out.println("over");
				
		}
			}

		private void display(Person person) {
			// TODO Auto-generated method stub
			System.out.println(person.getAge());
			System.out.println(person.getName());
			System.out.println(person.getNationality());
			System.out.println(person.getPhone());
			
		}

		

}
