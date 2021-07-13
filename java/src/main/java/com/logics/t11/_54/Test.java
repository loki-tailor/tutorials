package com.logics.t11._54;

interface X1 {
	default void print() { System.out.println("X1"); }
}

interface X2 extends X1 { void print(); }

interface X3 extends X2 {
	default void print() { System.out.println("X3"); }
}

class  X implements X3 {}

public class Test {
	public static void main(String[] args) {
		X1 o = new X();
		o.print();
	}
}

