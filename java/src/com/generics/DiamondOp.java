package com.generics;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class CreateO <T> {

	public T t;

	public CreateO() { }

	public CreateO(T t) { this.t = t; }

	public T getT() { return this.t; }

	public void resetT(T t) { this.t = t; }
}

class CreateTwo <T, U> {
	public T t;
	public U u;
	public T getT() { return this.t; }
	public U getU() { return this.u; }
	public CreateTwo(T t, U u) { this.t = t; this.u = u; }
}

class A {}
class B {}
class C {}



public class DiamondOp {
	public static void main(String[] args) {

		// #### valid java 5 declarations + instantation
		// LHS is Interface ; RHS is object
		List<String> list = new ArrayList<String>();
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		Map<String,  List<Integer>> m2 = new HashMap<String, List<Integer>>();

		// #### valid java7 declarations + instantation
		// LHS is interface with type ; RHS is generic
		List<String> list2 = new ArrayList<>();
		Map<String, Integer> m12 = new HashMap<>();
		Map<String,  List<Integer>> m22 = new HashMap<>();	

		// ### custom generic class usage
		CreateO<A> a1 = new CreateO<>();
		CreateO<B> b1 = new CreateO<>();
		CreateO<C> c1 = new CreateO<>();

		A a2 = a1.getT();
		B b2 = b1.getT();
		C c2 = c1.getT();

		A a3 = new A(); B b3 = new B(); C c3 = new C();
		a1.resetT(a3); 
		b1.resetT(b3);
		c1.resetT(c3);	
	
		// ##### custom generic with 2 params
		CreateTwo<A, B> _2 = new CreateTwo<>(a3, b3);
		
	
		System.out.println("execution done");
	}
}