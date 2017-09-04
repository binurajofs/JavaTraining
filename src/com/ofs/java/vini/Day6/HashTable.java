package com.ofs.java.vini.Day6;

import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

public class HashTable {

	public static void main(String[] args) {

		String str;

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		/*
		 * Adding key-value pairs to Hashtable put(K key, V value)
		 */
		hashtable.put("A", "Apple");
		hashtable.put("B", "Orange");
		hashtable.put("C", "Mango");
		hashtable.put("D", "Banana");
		hashtable.put("E", "Grapes");

		System.out.println("Hashtable contains:");

		/*
		 * public Set<K> keySet(): Returns a Set view of the keys contained in
		 * this map.
		 */
		Set<String> keys = hashtable.keySet();

		Iterator<String> itr = keys.iterator();

		// Displaying Key and value pairs
		while (itr.hasNext()) {

			str = itr.next();

			System.out.println("Key: " + str + " & Value: "
					+ hashtable.get(str));
		}
	}
}
