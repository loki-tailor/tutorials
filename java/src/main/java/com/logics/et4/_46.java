package com.logics.et4;

class B2 extends _46 {
}

public class _46 {
	public static void main(String[] args) {

		_46 a = new _46();
		B2 b = new B2();

		a = b;
//		b = a; // error
		a = (B2) b;
		b = (B2) a;

	}
}
