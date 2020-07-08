package com.functional_interfaces;

/**
 * created @ 24-01-2020
 * 
 * @author lokeshwar
 *
 */



public class Demo1 {

	public static void withoutFunctionalInterface() {
		// create anonymous inner class object
		new Thread(new Runnable() { 
			@Override
			public void run() {
				System.out.println("New thread created without using FI");
			}
		}).start();
	}

	public static void withFunctionalInterface() {
		new Thread(() -> { System.out.println("New thread created using FI"); }).start();
	}

	public static void main(String[] args) {
		//withoutFunctionalInterface();
		withFunctionalInterface();
	}

} // end of class
