package com.assignments;

/*-
	@created 03-08-2020

	----------------------------
	output:
	Before modify() a = 1
	number = 2
	After modify() a = 1
	----------------------------
*/

public class PassPrimitiveVarToMethod {
	public static void main(String [] args) {
		int a = 1;
		PassPrimitiveVarToMethod o = new PassPrimitiveVarToMethod();
		System.out.println("Before modify() a = " + a);
		o.modify(a);
		System.out.println("After modify() a = " + a);
	}
	void modify(int number) {
		number += 1;
		System.out.println("number = " + number);
	}
}