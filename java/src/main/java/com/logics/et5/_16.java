package com.logics.et5;

class A3 {
	static int x = 10;

	static void m() {
		System.out.println("inside A3.m()");
	}

}

class B3 extends A3 {
	static {
		System.out.println("inside static block of B3");
	}
}

public class _16 {
	public static void main(String[] args) {

		System.out.println("calling 'B3.m()'");
		B3.m();
		System.out.println();

		System.out.println("B3.x = " + B3.x);
	}
}
