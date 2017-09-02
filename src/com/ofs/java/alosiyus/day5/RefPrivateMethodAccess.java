package com.ofs.java.alosiyus.day5;

import java.lang.reflect.Method;

public class RefPrivateMethodAccess {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws Exception {
		        TestSample d = new TestSample();
		        Method m = TestSample.class.getDeclaredMethod("sample");
		       
		        m.setAccessible(true);
		        m.invoke(d);
		    }
	}


class TestSample{
    private void sample(){
        System.out.println("hello im sample method");
    }
}
