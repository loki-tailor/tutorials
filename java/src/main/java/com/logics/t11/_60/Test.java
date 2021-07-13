package com.logics.t11._60;

class Car {
	void speed(Byte val) { 
		System.out.println("DARK");
	}

	// if above was void speed(Byte... val) {...} // then ambiguous error would have came

	// if above was void speed(byte val) {..} // still DARK would have been printed

	void speed(byte... vals) {
		System.out.println("LIGHT");
	}

	// if above was void speed(Byte... vals) {..} // still DARK would have been printed
}

public class Test {
	public static void main(String[] args) {
		byte b = 10;

		// byte... a = 10; // compile error
		// new Car().speed((byte...) b); // compile errr
		// new Car().speed((Byte...) b); // compile errr

		new Car().speed(b);
	}
}

/*-
new Car().speed(b);` tags to speed(Byte) as boxing is preferred over variable arguments. Code as is prints DARK on to the console.
*/