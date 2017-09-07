package com.ofs.java.soma.day5;

import java.lang.reflect.Method;

public class task7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		sample object = new sample();
		Method m = sample.class.getDeclaredMethod("test");
		m.setAccessible(true);
		m.invoke(object);

	}

}

class sample {
	private void test() {
		System.out.println("Hello");
	}
}