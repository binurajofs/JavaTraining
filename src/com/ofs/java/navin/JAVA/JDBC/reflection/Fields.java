package com.ofs.java.navin.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Fields extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Fields fields = new Fields();
			Field publicField= Class.forName("com.ofs.java.navin.reflection.BaseClass").getField("name");
			Field privateField=Class.forName("com.ofs.java.navin.reflection.BaseClass").getDeclaredField("number");
			Field protectedField= Class.forName("com.ofs.java.navin.reflection.BaseClass").getDeclaredField("value");
			publicField.set(fields, "Rinosh");
			privateField.setAccessible(true);
			privateField.setInt(fields, 20);
			protectedField.setAccessible(true);
			protectedField.setDouble(fields, 2.0);
			BaseClass baseClass= new BaseClass();
			baseClass.display(baseClass);
			fields.displayReflection(publicField, privateField,protectedField, fields);
			Method privateMethod = Class.forName("com.ofs.java.navin.reflection.BaseClass").getDeclaredMethod("baseClassPrivateMethod", null);
			System.out.println("");
			privateMethod.setAccessible(true);
			privateMethod.invoke(fields, null);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	private void displayReflection(Field publicField, Field privateField, Field protectedField, Fields fields) {
		// TODO Auto-generated method stub
		try {
			System.out.println("........After Reflection........");
			System.out.println("Number is "+ privateField.get(fields));
			System.out.println("Name is "+ publicField.get(fields));
			System.out.println("Value is "+ protectedField.get(fields));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
