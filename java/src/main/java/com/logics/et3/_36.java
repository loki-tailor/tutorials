package com.logics.et3;

public class _36 {
	static int si = 10;

	public static void main(String[] args) {
		new _36();
	}

	public _36() {
		System.out.println(this);
		// if toString() is not overriden then, op = com.logics.et3._36@156643d4
	}

	@Override
	public String toString() {
		return "_36.si = " + this.si;
	}
}
