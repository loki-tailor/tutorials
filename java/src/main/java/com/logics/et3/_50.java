package com.logics.et3;

public class _50 {
//	static double percent; // error on return statement
	final static double percent = 0; // no error on return statement
//	final static double percent = 100; // error on return statement
	int offset = 10, base = 50;

	public static double calc(double value) {
		int coupon, offset, base;
		if (percent < 10) {
			coupon = 15;
			offset = 20;
			base = 10;
		}
		return coupon * offset * base * value / 100;
	}
}
