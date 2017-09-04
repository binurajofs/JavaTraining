package com.ofs.java.day5;

import java.lang.reflect.Method;

public class PrivateMehodReflection {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws Exception {
		       Sample d = new Sample();
		        Method m = Sample.class.getDeclaredMethod("Check");
		       
		        m.setAccessible(true);
		        m.invoke(d);
		    }
	}


class Sample{
    private void check(){
        System.out.println("hello im sample method");
    }
}