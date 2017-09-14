package com.ofs.java.soma.day7.servlet;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String args[]) {

		// ArrayList Creation
		ArrayList<String> cricketbowlers = new ArrayList<String>();
		cricketbowlers.add("Kumble");
		cricketbowlers.add("Ashwin");
		cricketbowlers.add("Srinath");
		cricketbowlers.add("H.Singh");

		System.out.println("Before Sorting the ArrayList:");
		for (String counter : cricketbowlers) {
			System.out.println(counter);
		}

		// Sorting the ArrayList
		System.out.println("");
		Collections.sort(cricketbowlers);

		System.out.println("After Sorting the ArrayList:");
		for (String counter : cricketbowlers) {
			System.out.println(counter);
		}
	}
}
