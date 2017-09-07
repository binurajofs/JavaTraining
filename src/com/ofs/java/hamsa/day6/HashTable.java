package com.ofs.java.hamsa.day6;

import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

public class HashTable {

	public static void main(String[] args) {

		String str;

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		hashtable.put("R", "Rolls-Royce");
		hashtable.put("A", "Audi");
		hashtable.put("B", "BMW");
		hashtable.put("I", "Isuzu");
		hashtable.put("N", "Nissan");

		System.out.println("Hashtable contains:");

		Set<String> keys = hashtable.keySet();

		Iterator<String> itr = keys.iterator();

		
		while (itr.hasNext()) {

			str = itr.next();
			
			
			if(str.equals("B"))
				itr.remove();
		
			
			System.out.println("Key: " + str + " & Value: "
					+ hashtable.get(str));
		
		}
	}
}