
package com.ofs.java.day6;

import java.util.ArrayList;
import java.util.Collections;
 
public class ReverseArrayList {
 
  public static void main(String[] args) {
 
    //create an ArrayList object
    ArrayList<String> arrayList = new ArrayList<String>();
   
    //Add elements to Arraylist
    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");
    arrayList.add("D");
    arrayList.add("E");
   
    System.out.println("Before Reverse Order, ArrayList Contains : " + arrayList);
   
    /*
      To reverse the order of all elements of Java ArrayList use,
      static void reverse(List list) method of Collections class.
     
      This method reverse the order of elements of specified list.
    */
   
    Collections.reverse(arrayList);
   
    System.out.println("After Reverse Order, ArrayList Contains : " + arrayList);
   
  }
}