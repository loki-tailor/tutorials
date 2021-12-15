package com.logics.et1;

public class _49 {
	public static void main(String[] args) {
		String s = "MINIMUM";

		System.out.println(s.substring(4, 7));
		System.out.println(s.substring(5));
//		System.out.println(s.substring(-1)); // error
		System.out.println(s.substring(s.indexOf('I', 3)));
		System.out.println(s.substring(s.indexOf("i", 4))); // error
	}
}
