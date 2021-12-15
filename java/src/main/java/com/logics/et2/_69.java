package com.logics.et2;

interface Flyer {
	String getName();
}

class Bird implements Flyer {
	public String name;

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
	}
}

public class _69 {
	public static void main(String[] args) {
		Flyer f = new Eagle("eagle text");

//		System.out.println(f.name); // error

		System.out.println(f.getName());

		System.out.println(((Eagle) f).name);

		System.out.println(((Bird) f).getName());

//		System.out.println(Eagle.name); // error
	}
}
