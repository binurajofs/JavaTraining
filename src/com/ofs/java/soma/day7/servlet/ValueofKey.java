package com.ofs.java.soma.day7.servlet;

import java.util.HashMap;

public class ValueofKey {

	public static void main(String[] args) {
		
		
   // Create a HashMap
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 
		     //add elements to HashMap
	   hmap.put(1, "AA");
       hmap.put(2, "BB");
       hmap.put(3, "CC");
	   hmap.put(4, "DD");
	   
	   // Getting values from HashMap
	   
	  String key =hmap.get(4);
		     
		 if (hmap.containsKey(key)) {
		    Object value = hmap.get(key);
		    System.out.println("Key : " + key +" value :"+ value);
		  }

	}

}
