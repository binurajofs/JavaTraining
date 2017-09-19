package com.ofs.java.navin.threads;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		System.out.println("Actual list : ");
		for(String str: list) {
			System.out.println(str);
		}
		Collections.swap(list, 2, 4);
		System.out.println("List after swapping Play and Glass	: ");
		for(String str: list) {
			System.out.println(str);
		}
	}

}
