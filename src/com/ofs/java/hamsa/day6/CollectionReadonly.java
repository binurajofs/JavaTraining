package com.ofs.java.hamsa.day6;

import java.util.*;


public class CollectionReadonly {

	public static void main(String[] args)
			throws Exception{
		List<String> stuff= new ArrayList<>();
		stuff.add("a");
		stuff.add("b");
		List<String> list= new ArrayList<>();
		list= Collections.unmodifiableList(stuff);
		try{
			list.set(0,"newValue");
		}catch (UnsupportedOperationException e){
			System.out.println("Collection is read-only now");
		}
		  Set<String> set = new HashSet<>(stuff);
	      set = Collections.unmodifiableSet(set);
	      Map<String, String> map = new HashMap<>();
	      map = Collections.unmodifiableMap(map);
	      System.out.println("Collection is read-only now.");
	}
		

	}


