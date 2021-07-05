package com.logics.t8;

import java.util.function.BinaryOperator;

public class Eg6 {
	public static void main(String[] args) {
		BinaryOperator<Integer> s = (a, b) -> a + b;

		BinaryOperator<Integer> d = (a, b) -> a / b;
	
		// System.out.println(s.apply(10.2,20)); // error
		System.out.println(d.apply(25,20));
	}
}