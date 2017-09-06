package com.ofs.java.alosiyus.day5;

import java.lang.reflect.Field;

public class FieldObjectReflex {

	
	int a=5;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          Class<MyObject> aClass=MyObject.class;
		//String classname="MyObject";
          //Class class = Class.forName(classname);
	Field field =aClass.getField("someField");
	if(field!=null) {
		System.out.println("success");
	}
	}

}
class MyObject{
	public String someField=null;
}
