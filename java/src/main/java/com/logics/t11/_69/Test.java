package com.logics.t11._69;

class Base {
	static void print() {
		System.out.println("BASE");
	}
}

class Derived extends Base {
	static void print() {
		System.out.println("DERIVED");
	}
}

public class Test {
	public static void main(String[] args) {

		// ########################################################################################

		Base b = null;
		Derived d = (Derived) b; // no error ; since b is null i.e. does not contain instance of Base
		d.print();

		// ########################################################################################

		// Derived d2 = (Derived) new Base(); // no compile error as Base is casted to 'Derived'
						   // runtime error of class cast exception

		// ########################################################################################

		Base b2 = new Base();
		// Derived d3 = new Base(); // error base cannot be converted to 'Derived'
		Derived d4 = (Derived) b2; // runtime ClassCastException

		System.out.println("done");

		// ########################################################################################
	
	}
}