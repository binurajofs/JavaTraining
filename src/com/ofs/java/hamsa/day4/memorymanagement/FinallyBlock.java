package com.ofs.java.hamsa.day4.memorymanagement;

import com.ofs.java.hamsa.day3.Person;

public class FinallyBlock {

		public static void main(String args[]){
				    Person person = new Person();
					try{
						person.setName("Hamsa");
						person.setAge(21);
						person.setNationality("Indian");
						
						
						FinallyBlock object=new FinallyBlock();
						object.display(person);
					}
					catch(Exception e){
						System.out.println(e.toString());
					}
					finally{
						System.out.println("Hamsa");
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


