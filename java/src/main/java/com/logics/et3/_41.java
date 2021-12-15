package com.logics.et3;

public class _41 {
	public static void main(String[] args) {
		System.out.println("a" + 'b' + 63);
		System.out.println("a" + 63);
		System.out.println('b' + new Integer(63));
		String s = 'b' + 63 + "a";
		System.out.println(s);
//		String s2 = 63 + new Integer(10); // error
	}
}
