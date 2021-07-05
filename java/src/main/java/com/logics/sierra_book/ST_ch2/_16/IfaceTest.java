package com.logics.sierra_book.ST_ch2._16;

/*-
	@author lokeshwar @created 15-07-2020
*/	

interface MyInterface {
	default int doStuff() {
		return 42;
	}
}

public class IfaceTest implements MyInterface {
	public static void main(String[] args) {
		new IfaceTest().go();
	}
	void go() {

		// v - A.
		System.out.println("class: " + doStuff()); // no compile error ; op :- "class: 43"

		// x - B.
		// System.out.println("iface: " + super.doStuff()); // compile error: cannot find symbol

		// v - C.
		System.out.println("iface: " + MyInterface.super.doStuff()); // no compile error ; op :- "iface: 42"

		// x - D.
		// System.out.println("iface: " + MyInterface.doStuff()); // compile error: non-static method doStuff() cannot be referenced from a static context

		// x - E.
		System.out.println("iface: " + super.Myinterface.doStuff()); // compile error: cannot find symbol

		// x - F
		// None of the lines, A-E will allow the code to compile
		
	}
	public int doStuff() {
		return 43;
	}	
}
