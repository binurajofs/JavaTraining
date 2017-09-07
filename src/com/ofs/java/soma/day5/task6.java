package com.ofs.java.soma.day5;

import java.lang.reflect.Field;

public class task6 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Class<Myobject> sample = Myobject.class;
		Field field = sample.getField("firstfield");
		if (field != null) {
			System.out.println("Finished");
		}
	}

}

class Myobject {
	public int firstfield = 10;

}
