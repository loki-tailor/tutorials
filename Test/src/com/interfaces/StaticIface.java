package com.interfaces;

interface StaticIface {
	static int m1() { return 42; } // legal
	public static void m2() { ; } // legal	
}

