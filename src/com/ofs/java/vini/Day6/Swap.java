package com.ofs.java.vini.Day6;

import java.util.ArrayList;
import java.util.Collections;


public class Swap {
	 public static void main(String[] args) {
		    ArrayList<String> arrayList = new ArrayList<String>();
		    arrayList.add("A");
		    arrayList.add("B");
		    arrayList.add("C");
		    arrayList.add("D");
		    arrayList.add("E");
		    System.out.println("before swap :"+arrayList);
		    Collections.swap(arrayList, 2, 3);
		    System.out.println("After swap :"+arrayList);
		  }
		}
		
		
		


