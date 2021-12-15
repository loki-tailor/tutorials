package com.logics.et3;

public class _27 {
	int value = 1;
	_27 link;

	public _27(int val) {
		this.value = val;
	}

	public static void main(String[] args) {
		final _27 a = new _27(5);
		_27 b = new _27(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println(a.link.value + " " + b.link.value);
	}

	public static _27 setIt(final _27 x, final _27 y) {
		x.link = y.link;
		return x;
	}
}
