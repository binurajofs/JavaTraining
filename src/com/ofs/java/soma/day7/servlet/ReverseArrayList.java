package com.ofs.java.soma.day7.servlet;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String args[]) {

		// ArrayList Creation
		ArrayList<String> Socceres = new ArrayList<String>();
		Socceres.add("Messi");
		Socceres.add("Ronaldo");
		Socceres.add("Villa");
		Socceres.add("Torress");

		System.out.println("Before Reversing the ArrayList:");
		for (String counter : Socceres) {
			System.out.println(counter);
		}

		Collections.reverse(Socceres);

		System.out.println("");
		System.out.println("After Reversing the ArrayList:");

		for (String counter : Socceres) {
			System.out.println(counter);
		}
	}
}
