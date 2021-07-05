package com.constructors.constructor_overloading;

/*-
	@author lokeshwar @created 13-07-2020
*/

class Animal {
	String name;

	Animal() {
		this(makeRandomName());
	}

	Animal(String name) {
		this.name = name;
	}

	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] { "btwin", "trek", "polygon", "java", "cannondale", "speciallized" }[x];
		return x + "\t" + name;
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) throws InterruptedException {
		do {
			Animal a = new Animal();
			System.out.println(a.name);
			Animal b = new Animal("-\tcustom-carbon");
			System.out.println(b.name + "\n");
			Thread.sleep(1000);
		} while (true);
	}
}
