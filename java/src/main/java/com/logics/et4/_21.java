package com.logics.et4;

interface A {
	default void hello() {

	}
}

interface B extends A {
	default void hello() {
//		super.hello(); // error: super reference is illegal in interface context
		A.super.hello(); // valid
	}
}

public class _21 implements B {
	public void hello() {
//		super.hello();// invalid: method hello() is undefined in type Object

//		A.super.hello(); // invalid, since '_21' class does not implement 'A' directly
		// error for above: Illegal reference to super type A, cannot bypass the more
		// specific direct super type com.logics.et4.B

		B.super.hello(); // valid
	}
}
