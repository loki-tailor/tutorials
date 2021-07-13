package com.logics.t11._72;

class Parent {
	int var = 1000;

	int getVar() {
		return var;
	}
}

class Child extends Parent {
	private int var = 2000; // variable hiding : permitted : default to private modifer changed, which is
							// allowed

	int getVar() {
		return super.var;
	} // permitted calling super class using super
}

public class Test {
	public static void main(String[] args) {
		System.out.println("execution completed");

		// ####################################################################################
		Child c = new Child();
		// System.out.println(c.var); // error since var is overidden in Child and made
		// private
		System.out.println(c.getVar());

		// ####################################################################################
		Parent p = new Child();
		System.out.println(p.var);

		// ####################################################################################
		// c = new Parent(); // error : parent cannot be converted to child

		// Child c2 = null; c2 = new Parent(); // error: imcompatible types : parent
		// cannot be converted to child

		Child c3 = null;
		Parent p3 = new Parent();
		c3 = (Child) p3; // allowed : casting of parent to child and then store in child

		// ####################################################################################

		// so basically, what i think is that : child is allowed to store parent
		// instance, iff at compile time, the instance of the reference of type Child is
		// undefined & explicit casting is happening

	}
}