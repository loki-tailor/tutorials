package com.logics.t11._56;

public class Test {
	static int i1 = 10;
	int i2 = 20;

	int add() {
		return this.i1 + this.i2; 
	}

	public static void main(String[] args) {
		System.out.println(new Test().add());

		// int a = Test.i2; // error: non-static access done instead of static access
	}
}