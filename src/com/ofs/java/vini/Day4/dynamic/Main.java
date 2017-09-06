package com.ofs.java.vini.Day4.dynamic;


	public class Main extends  DynamicLoading {

		public static void main(String[] args) {

			 DynamicLoading javaClassLoader = new  DynamicLoading();
			javaClassLoader.invokeClassMethod("com.ofs.java.vini.Day4.dynamic.MyClass", "sayHello");
			
		}

}
