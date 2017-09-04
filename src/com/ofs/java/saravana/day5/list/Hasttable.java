package com.ofs.java.saravana.day5.list;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.AttributeSet;


public class Hasttable {

	private static Iterator<Integer> i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str= "B",s = null;

		Hashtable<String, String> hash = new Hashtable<String, String>();
hash.put("A", "Apple");
hash.put("B","Ball");
hash.put("C", "Cat");
hash.put("D", "Dog");
hash.put("E", "Elephant");
hash.put("F", "Father");
Set<String> keys = hash.keySet();
Iterator<String> i = keys.iterator();
while(i.hasNext()) {
	 
if(str.equals(keys.iterator().next())) {
	keys.remove(str);
	}
s=i.next();
}
System.out.println("the real value is:"+hash.get(s));

	
	}
	}
