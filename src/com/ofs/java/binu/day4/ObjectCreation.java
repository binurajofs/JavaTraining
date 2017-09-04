package com.ofs.java.binu.day4;

public class ObjectCreation {

	public void forloop() {
		System.out.println("uday");
	}

	public void whileloop() {
		System.out.println("kumar");
	}

	public static void main(String[] args) {
		int i = 0;
		// object creation inside the for loop
		for (i = 0; i < 5; i++) {
			ObjectCreation a = new ObjectCreation();
			a.forloop();
		}
		// object creation outside the for loop
		ObjectCreation b = new ObjectCreation();
		for (i = 0; i < 5; i++) {
			b.forloop();
		}
		int j = 0;
		// object creation inside the while loop
		while (j < 5) {
			ObjectCreation c = new ObjectCreation();
			c.whileloop();
			j++;
		}
		// object creation outside the while loop
		j = 0;
		ObjectCreation d = new ObjectCreation();
		while (j < 5) {
			d.whileloop();
			j++;
		}

	}
}
