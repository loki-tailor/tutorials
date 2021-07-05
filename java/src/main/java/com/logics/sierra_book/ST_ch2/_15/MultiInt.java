package com.logics.sierra_books.ST_ch2._15;

/*-
	@created 15-07-2020
	
		x - 1
		x - 2
		x - 3
		x - The output is unpredictable
	v - Compilation fails 
		x - An exception is thrown at runtime

	* The implementing method "doStuff()" must be marked public
*/

interface I1 {
	default int doStuff() { return 1; }
}

interface I2 {
	default int doStuff() { return 2; }
}

public class MultiInt implements I1, I2 {
	public static void main(String[] args) {
		new MultiInt().go();
	}
	void go() {
		System.out.println(doStuff());
	}
	// int doStuff() { return 3; } // compile error: doStuff() in MultiInt cannot implement doStuff() in I1
}
