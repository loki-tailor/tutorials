package com.logics.et5;

public class _70 {

	public void m(Object o) { System.out.println("object version"); }
	public void m(java.io.FileNotFoundException f) { System.out.println("FNFE version"); }
	public void m(java.io.IOException f) { System.out.println("IOE version"); }
	
//	public void m(String s) { System.out.println("string version"); } // if kept this with above all, the ambiguous error	
//	public void m(Double s) { } same as above
	
	public static void main(String[] args) {
		_70 obj = new _70();
		obj.m(null);
		
		obj.d(null);
	}
	
	public void d(A a) {}
	public void d(B b) {}
//	public void d(C c) {}
	
}


class A {}
class B extends A {}
class C {}
