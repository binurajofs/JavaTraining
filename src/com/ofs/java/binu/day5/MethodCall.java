package com.ofs.java.binu.day5;

import java.lang.reflect.*;

public class MethodCall {

	public static void main(String[] args) throws Exception {
		PrivateMethod d = new PrivateMethod();
		Method m = PrivateMethod.class.getDeclaredMethod("message");
		m.setAccessible(true);
		m.invoke(d);
	}
}