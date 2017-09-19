package com.ofs.java.navin.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadOnly {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List stuff = Arrays.asList(new String[] {"a","b"} );
		List list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);
		try {
			list.set(0, "new value");
		}catch(UnsupportedOperationException e) {
			System.out.println("Error.....!!");
			System.out.println(e);
		}
	}

}
