package com.ofs.java.soma.day6.thread;

import java.util.ArrayList;

import java.util.Collections;


public class collectionlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Good");
		list.add("Morn");
		list.add("New");
	    list.add("Day");
	    System.out.println(list);
	    list = (ArrayList) Collections.unmodifiableList(list);
	    try {
	    	list.add("Dream");
	    	list.add("Night");
	    	list.add("Gone");
	    	}catch(Exception e)
	    {
	    	e.printStackTrace();
	    		System.out.println("Error");
	    }
	    System.out.println("The total value list are: "+list);
				
	}

}
