package com.logics.et5;

interface I {
}

class A1 implements I {
}

class B1 extends A1 {
}

class C1 extends B1 {
}

public class _53 {
	public static void main(String[] args) {
		
		A1 a = new A1();
		B1 b = new B1();
		
//		a =(B1) (I) b;
		
//		b = (B1) (I) a; // RE : classcastexception
		
//		a = (I) b;
		
		I i = (C1) a;
		
		System.out.println("done");
	}	
}
