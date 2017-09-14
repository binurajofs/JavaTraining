package com.ofs.java.soma.day7.servlet;

import java.util.*;

public class EmptylistOrNot {

	public static void main(String[] args) {

		// Create an ArrayList.
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Gate");
		mylist.add("Door");
		mylist.add("Key");
		mylist.add("Wall");

		// Test whether the array is empty or not.
		if (mylist.isEmpty()) {
			System.out.println("The ArrayList is empty");
		} else {
			System.out.println("The ArrayList is not empty");
		}
	}
}
