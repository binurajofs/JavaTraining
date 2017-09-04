package com.ofs.java.vini.Day4;

import com.ofs.java.vini.day3.Person;

public class Finally {
	public static void main(String args[]){
			    Person person = new Person();
				try{
					person.setName("vinitha");
					person.setAge(21);
					person.setNationality("Indian");
					person.setAge(21);
					
					Finally object=new Finally();
					object.display(person);
				}
				catch(Exception e){
					System.out.println(e.toString());
				}
				finally{
					System.out.println("vinitha");
					System.gc();
					System.out.println("over");
					
			}
				}

			private void display(Person person) {
				// TODO Auto-generated method stub
				System.out.println(person.getAge());
				System.out.println(person.getName());
				System.out.println(person.getNationality());
				System.out.println(person.getAge());
				
			}

			

	}


 