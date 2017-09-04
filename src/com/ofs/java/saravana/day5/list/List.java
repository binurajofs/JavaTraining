package com.ofs.java.saravana.day5.list;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(32);
list.add(23);
list.add(3333);
list.add(455);
list.add(546);
list.add(78);
list.add(8);
list.add(910);
System.out.println("the unsorted list is "+list);
System.out.println();
Collections.sort(list);
System.out.println("the sorted list is "+list+"\n");
System.out.println("the before swap is "+list+"\n");
Collections.swap(list, 2, 7);
System.out.println("the after swap is "+list);	
	
	}

}
