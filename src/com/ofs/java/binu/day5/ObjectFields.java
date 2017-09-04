package com.ofs.java.binu.day5;

import java.lang.reflect.*;

public class ObjectFields {

	public static void main(String[] args) {

		ObjectFields c = new ObjectFields();
		Class<?> cls = c.getClass();

		System.out.println("Field =");

		try {
			// string field
			Field sField = cls.getField("string1");
			System.out.println("Public field found: " + sField.getName());
		} catch (NoSuchFieldException e) {
			System.out.println(e.toString());
		}
	}

	public ObjectFields() {
		// no argument constructor
	}

	public ObjectFields(String string1) {
		this.string1 = string1;
	}

	public String string1 = "tutorialspoint";

}
