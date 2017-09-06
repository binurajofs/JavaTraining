package com.ofs.java.alosiyus.day6;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> map = new Hashtable<String, String>();
		map.put("one", "eno");
		map.put("two", "owt");
		map.put("three", "eerht");

		for (Iterator<Map.Entry<String, String>> i = map.entrySet().iterator(); i.hasNext(); ) {
		    Map.Entry<String, String> entry = i.next();

		    if ("two".equals(entry.getKey())) {
		        // Removes entry from Hashtable; note, this is not the Hashtable.remove() method
		        // but the Iterator.remove() method
		        i.remove();
		    }
		}

		System.out.println(map);
	}

}
