package com.ofs.java.saravana.day5.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Readonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
System.out.println(list);
list = Collections.unmodifiableList(list);
try {
list.add(6);
list.add(7);
list.add(8);}
catch(UnsupportedOperationException e) {
e.printStackTrace();
System.out.println("Exception occured");
}
System.out.println("The unmodified list after adding the new number"+list);
	}

}
