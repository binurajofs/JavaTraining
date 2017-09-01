package com.ofs.java.kannan.memorymanagement;

public class StringOperations {

	public static void main(String args[]) {
		String firstName = "Kannan";
		String lastName = " Balasubramanian";
		String name = firstName + lastName;
		System.out.println("Name is " + name);

		String concatName = firstName.concat(lastName);
		System.out.println("Name using concat function is " + concatName);

		StringBuilder stringBuilder = new StringBuilder("Saravana");
		stringBuilder.append(" Shanmugam");
		System.out.println("After Appending using String Builder is " + stringBuilder);

		StringBuffer stringBuffer = new StringBuffer("Raj");
		stringBuffer.append(" Kamal");
		System.out.println("After appending using String Buffer is " + stringBuffer);

	}
}
