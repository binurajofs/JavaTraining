package com.ofs.java.day6;
import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
	  public static void main(String[] args) {
	    ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add("A");
	    arrayList.add("B");
	    arrayList.add("C");
	    arrayList.add("D");
	    arrayList.add("E");
	    System.out.println(arrayList);
	    Collections.swap(arrayList, 2, 3);
	    System.out.println(arrayList);
	  }
	}
	
	
	

