package com.ofs.java.soma.day6.thread;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("dude");
		list.add("nice");
		list.add("play");
		list.add("today");

		// To reverse the list
		System.out.println("Displayed list: " + list);
		Collections.reverse(list);
		System.out.println("");
		System.out.println("Reverseded List: " + list);

		// To swap the list
		Collections.swap(list, 0, 2);
		System.out.println("");
		System.out.println("Swapped List: " + list);

	}

}
