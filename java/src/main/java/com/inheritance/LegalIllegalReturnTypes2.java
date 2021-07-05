package com.inheritance;

/*-
	@author lokeshwar @created 13-07-20

	Demonstrating: Overridden method can only return 'subtype' & not 'supertype', of the return-type in it's 'supertype' class.
*/

class A {
	public A m1() { System.out.println("A.m1(), returning A, return type A "); return new A(); }
	// public A m1() { System.out.println("A.m1(), returning A, return type A"); return this; }
}

class B extends A {
	// public A m1() { System.out.println("B.m1(), returning A, return type A"); return new A(); }
	public A m1() { System.out.println("B.m1(), returning B, return type A"); return new B(); }
}

class C extends B {
	// public A m1(){ System.out.println("C.m1(), returning A, return type A"); return new A(); }
	// public A m1(){ System.out.println("C.m1(), returning B, return type A"); return new B(); }
	// public A m1(){ System.out.println("C.m1(), returning C, return type A"); return new C(); }

	// public B m1(){ System.out.println("C.m1(), returning A, return type B"); return new A(); } // compile error: incompatible types: A cannot be converted to B
	// public C m1(){ System.out.println("C.m1(), returning B, return type C"); return new B(); } // compile error: incompatible types: B cannot be converted to C
	public B m1() { return new B(); }
}

// --------------------------------------------------------
class X {
	public B m1() { return new B(); }
}
class Y extends X {
	// public A m1(){ return new C(); } //** compile  error: m1() in Y cannot override m1() in X
	public B m1(){ return new C(); }
}
// --------------------------------------------------------
public class LegalIllegalReturnTypes2 {
	public static void main(String[] args) {
		new A().m1();
		new B().m1();
		new C().m1();
	}
}

