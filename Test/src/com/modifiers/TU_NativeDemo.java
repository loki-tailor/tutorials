package com.modifiers;

/**
	@author = lokeshwar created @ 16-12-19
	Demonstration of usage of 'native' keyword
	TODO: Understand JNI - https://stackoverflow.com/a/30635871/7415499
*/

public class TU_NativeDemo {
	public native int square (int i);
	public static void main (String[] args) {
		System.loadLibrary("Main");
		// System.out.println(new Main().square(2));
	}
} // end of class
