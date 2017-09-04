package com.ofs.java.vini.Day5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection1 extends Reflection {
	public static void main(String args[]) {
		try {
			Reflection1 fields = new Reflection1();
			Field publicField = Class.forName("com.ofs.java.vini.Day5.Reflection").getField("name");
			Field privateField = Class.forName("com.ofs.java.vini.Day5.Reflection").getDeclaredField("number");
			Field protectedField = Class.forName("com.ofs.java.vini.Day5.Reflection").getDeclaredField("value");
			publicField.set(fields, "yuganthi");
			privateField.setAccessible(true);
			privateField.setInt(fields, 20);
			protectedField.setAccessible(true);
			protectedField.setDouble(fields, 2.0);
			Reflection baseClass = new Reflection();
			baseClass.display(baseClass);
			fields.displayReflection(publicField, privateField, protectedField,
					fields);
			Method privateMethod = Class.forName("com.ofs.java.vini.Day5.Reflection").getDeclaredMethod("baseClassPrivateMethod", null);
			privateMethod.setAccessible(true);
			privateMethod.invoke(fields, null);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void displayReflection(Field publicField, Field privateField,
			Field protectedField, Reflection1 fields) {

		try {
			System.out.println("----After Reflection----");
			System.out.println("Number is " + privateField.get(fields));
			System.out.println("Name is " + publicField.get(fields));
			System.out.println("Value is " + protectedField.get(fields));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
