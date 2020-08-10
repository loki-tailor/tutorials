package com.assignments;

/*-
	@created 03-08-2020

	----------------------------------------
	output:
	a1.height = 10
	a1.height = 30, after change to b1
	----------------------------------------
*/

import java.awt.Dimension;

public class ReferenceTest {
	public static void main(String[] args) {
		Dimension a1 = new Dimension(5,10);
		System.out.println("a1.height = " + a1.height);
		Dimension b1 = a1;
		b1.height = 30;
		System.out.println("a1.height = " + a1.height + ", after change to b1");
	}
}