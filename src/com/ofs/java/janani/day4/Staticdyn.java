package com.ofs.java.janani.day4;

public class Staticdyn {
	public static void main(String args[]) {
		Staticdyn m=new Staticdyn();
		m.day1();
		ClassLoader cl = Staticdyn.class.getClassLoader();
		try {
			Class<?> cls = cl.loadClass("LoadClass");

		} catch (ClassNotFoundException e) {
			System.out.println("Exception:" + e);
		}
	}

	
	public void day1(){
		System.out.println("janani");
	}

}
