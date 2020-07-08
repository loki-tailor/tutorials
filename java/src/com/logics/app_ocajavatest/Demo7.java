package com.logics.app_ocajavatest;

/**
	created @ 25-01-2020
*/

public class Demo7 {
	private int numberBags;
	boolean call;

	public Demo7() {

		// LINE 1
		// this(2); // valid and will print 2
		// Demo7(2); // invalid
		// new Demo7(2); // valid but will not print 2

		call = false;  


		// LINE 2
		// Demo7(2); // invalid
		// new Demo7(2); // valid but will not print 2
		// this(2); // invalid since this should be the first line in the constructor
	}
	public Demo7(int numberBags) {
		this.numberBags = numberBags;
	}
	public static void main(String[] args) {
		Demo7 demo = new Demo7();
		System.out.println(demo.numberBags);
	}	
}