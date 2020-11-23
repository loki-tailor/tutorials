package com.garbage_collection;

/*-
	@created August 11, 2020
*/

public class ForcingGC {
	public static void main(String [] args) {
		ForcingGC obj = new ForcingGC();
		obj.display();	
		System.out.println(obj);
		obj = null;
		System.out.println(obj);
		Runtime.getRuntime().gc();	
	}
	void display() {
		System.out.println("Hello World");
	}
}