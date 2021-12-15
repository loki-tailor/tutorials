package com.logics.et2;

/***
 * ref https://enthuware.com/forum/viewtopic.php?f=2&t=1196
 * 
 * @author DELL
 *
 */

class A {

	static String static_default = "static_default ";
	static {
		System.out.println(static_default);
	}

	String instance_default = "instance_default";
	{
		System.out.println(instance_default);
	}

	A() {
		System.out.println("inside constructor 1st line..");
		print();
	}

	void print() {
		System.out.println("A");
	}
}

public class _56a extends A {
	int i = 4;

	public static void main(String[] args) {
		A a = new _56a();
		a.print();
	}

	void print() {
		System.out.println(i);
	}
}
