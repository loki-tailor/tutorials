package com.modifiers.pkg;

public class Beverage {

	public static void main (String[] args) {
		System.out.println("Inside Beverage");
		new Beverage().bm();
	}

	public void bm() {
		System.out.println("bm method of Beverage");
	}
}
