package com.garbage_collection;

/*-
	@created August 11, 2020
*/

import java.util.Date;

public class CheckGC {
	public static void main(String [] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM Memory = " + rt.totalMemory()/(1024));
		System.out.println("Free  JVM Memory = " + rt.freeMemory()/(1024));
		System.out.println("object creation started");
		Date d = null;
		for(int i = 0; i<10; i++) {
			System.out.println();
			System.out.println("Free  JVM Memory = " + rt.freeMemory()/(1024));
			d = new Date();
			d = null;
			
			// rt.gc(); // an alternative to System.gc();
			// System.out.println("rt.gc() called...");
			// System.out.println("Free  JVM Memory = " + rt.freeMemory()/(1024));
		}
		System.out.println("object creation completed");
		System.out.println("Free  JVM Memory = " + rt.freeMemory()/(1024));
		rt.gc(); // an alternative to System.gc();
		System.out.println("rt.gc() called...");
		System.out.println("Free  JVM Memory = " + rt.freeMemory()/(1024));
	}
}