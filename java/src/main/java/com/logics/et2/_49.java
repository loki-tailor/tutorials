package com.logics.et2;

interface I1 {
	int VALUE = 1;

	void m1();
}

interface I2 {
	int VALUE = 1;

	void m1();
}

public class _49 implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("HELLo");
	}

	public static void main(String[] args) {
		_49 tc = new _49();
		((I1) tc).m1();
//		System.out.println(VALUE); // compile error as it is ambiguous
		int a = tc.VALUE; // the field tc.VALUE is ambiguous
	}

}
