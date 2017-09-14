package com.ofs.java.soma.day7.servlet;

import java.util.ArrayList;
import java.util.HashSet;

//Program to convert hash set to Array list...
public class Arraylist {

	public static void main(String[] args) {

		// HashSet Creation
		HashSet<String> list = new HashSet<String>();
		System.out.println("Cricketers in HashSet:");
		list.add("Dravid");
		list.add("Sachin");
		list.add("Dhoni");
		list.add("Ganguly");
		list.add("Ravi Shastri");

		System.out.println("Hashset presents: " + list);

		System.out.println("");
		System.out.println("HashSet converted into ArrayList...");
		System.out.println("");

		// ArrayList Creation
		System.out.println("Cricketers in Arraylist:");
		ArrayList<String> list2 = new ArrayList<String>(list);
		System.out.println("Ararylist presents: " + list2);
	}

}
