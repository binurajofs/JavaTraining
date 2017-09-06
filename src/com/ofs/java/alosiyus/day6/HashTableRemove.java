package com.ofs.java.alosiyus.day6;


import java.util.Hashtable;
import java.util.Iterator;



public class HashTableRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> players = new Hashtable<Integer,String>();

        players.put(1, "Alosiyus");
        players.put(2, "Rahul Dravid");
        players.put(3, "MS Dhoni");
        players.put(4, "Rohit Sharma");

       Iterator<Integer> iterators = players.keySet().iterator();
       while(iterators.hasNext()) {
           int key = iterators.next();
           if(players.get(key).startsWith("R")) {
               iterators.remove();
           }
       }

        System.out.println(players);
	}

}
