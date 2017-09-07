package com.ofs.java.hamsa.day6;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println("Before Reverse Order, ArrayList Contains : "
				+ arrayList);

		Collections.reverse(arrayList);

		System.out.println("After Reverse Order, ArrayList Contains : "
				+ arrayList);

	}
}
