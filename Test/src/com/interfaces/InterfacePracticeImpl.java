package com.interfaces;

/** @author = lokeshwar, created @ 16-12-19 */

// ########################################################################################################################################

/************ Demonstration of Interface ***************/

class DemoClassToExtendInterface { /* classes cannot be extended by any interfaces */ }

interface DemoInterface2 {

	// below are valid method signature for a interface methods
	void method1();
	public void method2();
	abstract void method3();
	public abstract void method4();
	abstract public void method5();

	// below are invalid method signatures for a interface method q
	// compile error: modifier final/private/protected not allowed here
	// final void method6();
	// private void method7();
	// protected void method8();

	// below are valid variable declaration
	public int a = 1; // it's implicitly static and final
	final int b = 1; // it's implicitly public & static
	public static int c = 1; // implicitly final
	public final int d = 1; // implicitly static
	static final int e = 1; // implicitly public
	public static final int f = 1; 	

	// below are invalid variable declaration
	// private int x = 10;
	// public static final int z;	 	
}

interface DemoInterfaceToImplementInAnotherInterface {}

interface DemoInterface extends DemoInterfaceToImplementInAnotherInterface {

	// Interface methods are by default 'public' & 'abstract'
	void method1();	
	static int x = 99;
	static void staticMethod(String var) { System.out.println("Static Method: Hello " + var); }
	default int defaultMethod(int a) { return a*a; }

	// valid default method declarations
	default String m1() { return ""; }
	public default void m2() {}

	// Invalid default method declarations
	// static default void m3() {}
	// abstract default void m4() {}
	// default void m4();

	// valid static method declarations
	static void s1() {}
	public static void s2() {}
	
	// invalid static method declaration
	// static void s3();
	// protected static void s4() {}
	// private static void s5() {}
	// final static void s6() {}
	// abstract static void s7() {}
	
	
}
public class InterfacePracticeImpl implements DemoInterface { 

	// Inheriting method should be implemented as public, otherwise compile time error comes
	public void method1() { 		
		System.out.println("Inside overriden method - method1()"); 
		System.out.println("Value of x = " + x);

		// modifying variables declared inside interface is not allowed, because, they are public final static by default
		// compile error: cannot assign a value to final variable x		
		// x = 20;
	} 
	public static void main (String[] args) {
		new InterfacePracticeImpl().method1();	
		System.out.println("Default Method: Square = " + new InterfacePracticeImpl().defaultMethod(2));
		DemoInterface.staticMethod("Lokeshwar");

		// invalid way of calling static method of an interface
		// new InterfacePracticeImpl().staticMethod("Loki");
		// InterfacePracticeImpl.staticMethod("loki");
	}
} // end of class
