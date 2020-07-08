package com.logics.app_ocajavatest;

/**
	created @ 28-01-2020
	@author lokeshwar
*/

import java.util.Arrays;

public class Demo9 {

	String globalVar = "lokeshwar";
	
	public void m1() { System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " = " + this.globalVar); }
	
	public void m2() { System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " = " + this.globalVar); }
	
	// error - public static void m3() { System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " = " + this.globalVar); }
	// err = non-static reference to variable 'globalVar' in static block

	// private constructor, if below was not written, then usage of this() would have given error as below:
	// error: constructor Demo9 in class Demo9 cannot be applied to given types; 
	private Demo9() {}

	// private constructor
	private Demo9(String s) { this(); System.out.println("private constructor - " + Thread.currentThread().getStackTrace()[1].getMethodName() + " = " + this.globalVar); }
	
	// below is invalid, since this() can only be called inside a constructor 
	// error: call to this must be first statement in constructor
	//public void callThisConstructor() { this(); }

	public static void main(String[] args) {
		new Demo9().m1();
		new Demo9().m2();
		//new Demo9().m3();
		System.out.println();
		System.out.println("Thread.currentThread() = " + Thread.currentThread());
		System.out.println();
		System.out.println("Thread.currentThread().getStackTrace() = " + Arrays.toString(Thread.currentThread().getStackTrace()));
		System.out.println();
		System.out.println("Thread.currentThread().getStackTrace()[1] = " + Thread.currentThread().getStackTrace()[1]);
		System.out.println();
		System.out.println("Thread.currentThread().getStackTrace()[1].getMethodName() = " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
} // end of class