package com.ofs.java.binu.day6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println("Before swapping");
		for (Integer inte : list) {
			System.out.println(inte);
		}
		System.out.println("after reversing");
		Collections.reverse(list);
		for (Integer inte : list) {
			System.out.println(inte);
		}
		System.out.println("after swapping");
		Collections.swap(list, 0, 1);
		for (Integer inte : list) {
			System.out.println(inte);
		}
	}
}
