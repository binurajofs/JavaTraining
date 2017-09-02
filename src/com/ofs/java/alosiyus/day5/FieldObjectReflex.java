package com.ofs.java.alosiyus.day5;

import java.lang.reflect.Field;

public class FieldObjectReflex {

	
	int a=5;
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
          Class aClass=MyObject.class;
	Field field =aClass.getField("someField");
	if(field!=null) {
		System.out.println("success");
	}
	}

}
class MyObject{
	public String someField=null;
}
