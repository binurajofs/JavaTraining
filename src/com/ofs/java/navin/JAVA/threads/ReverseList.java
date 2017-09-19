package com.ofs.java.navin.threads;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

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
		Collections.reverse(list);
		System.out.println("");
		System.out.println("List after reversal : ");
		for(String str: list) {
			System.out.println(str);
		}
	}

}
