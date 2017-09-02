package com.ofs.java.alosiyus.day6;

import java.util.Collections;
import java.util.Hashtable;

public class HashTableRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer , String> ht = new Hashtable<Integer , String>();
		ht.put(1234, "ABCD");
		
		ht.put(2345, "EFGH");
		ht.put(4567, "IJKL");
		System.out.println("Deleting entry with key 2345");
		ht.remove(2345);
		//ht.values().remove("ABCD");
		//ht.values().removeAll(Collections.singleton("ABCD"));

		System.out.println(ht.toString());
	}

}
