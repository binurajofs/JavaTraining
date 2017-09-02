package com.ofs.java.alosiyus.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>  mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
 
        System.out.println("Original List : " + mylist);
 
        // Here we are using reverse() method
        // to reverse the element order of mylist
        //Collections.reverse(mylist);
 Collections.swap(mylist,2, 3);
        System.out.println("Modified List: " + mylist);
	}

}
