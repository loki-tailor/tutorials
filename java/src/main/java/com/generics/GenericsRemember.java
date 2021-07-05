package com.generics;

import java.util.List;
import java.util.ArrayList;

/*-

# A : Can:
# 1 : <TypeName> hold exact match
# 2 : wild card <?> hold any match
# 3 : wild card <? extends TypeName> : UpperBound : hold own and sub-types
# 4 : wild card <? super TypeName> : LowerBound : hold own and super-types
# 5 : wild cards only specified in variable declaration and method parameters

# B : Can't
# 1 : cannot add item in a list with unbounded or upper bounded wildcards, as they are immutable
# 2 : cannot use an object in method if parameter & class in-scope have same name
# 3 : cannot specify bounds without wildcard (?)

*/

class A {}
class B extends A {}
class C extends A {}

public class GenericsRemember {
	public static void main(String[] args) {

		// ############################################################################		
		// ## A.1
		List<A> l1 = new ArrayList<>();
		l1 = new ArrayList<A>();
		// List<A> l3 = new ArrayList<Object>(); // error
		// List<A> l4 = new ArrayList<B>(); // error

		// ############################################################################
		// # A.2
		List<?> l5 = new ArrayList<A>();
		l5 = new ArrayList<B>();
		List<?> l6 = new ArrayList<C>();

		// ############################################################################
		// ## A.3
		List<? extends A> l7 = new ArrayList<A>(); // allowed = A, B, C ; not-allowed: e.g. Objects
		// List<? extends A> l8 = new ArrayList<Object>(); // error
		List<? extends A> l9 = new ArrayList<>(); // allowed

		// List<? extends B> l10 = new ArrayList<A>(); // error ; allowed = B, C i.e. sub-types of B

		// ############################################################################
		// ## A.4
		List<? super A> l11 = new ArrayList<>(); 
		List<? super A> l12 = new ArrayList<A>(); // allowed: A, Object only

		List<? super B> l13 = new ArrayList<A>(); // allowed: A, B, Object only
		// List<? super B> l14 = new ArrayList<C>(); // error


		// ############################################################################
		// ## A.5
		// List<?> l15 = new ArrayList<?>(); // error
		// List<?> l16 = new ArrayList<? extends B>(); // error

		System.out.println("execution completed");
	}

	// ############################################################################
	// ## A.5 
	
	<T> T first(List<?> list) { T t = null; return t; }	// valid

	<T> T second(List<? extends B> list) { T t = null; return t; } // valid

	void third(List<? super C> list) { return; } // valid
 
	// <T> <? extends B> fourth(List<? extends B> list) { return list; } // invalid

	// ############################################################################
	// ## B.2
	
	<T> T valid_one() { T t = null; return t; }

	// <B> B invalid_one() { B b = new B(); return B; } // invalid

	<B extends A> B valid_2() { return null; } // valid

	// <B extends A> B invalid_2() { return B; } // invalid

	// ############################################################################
	// ## B.3

	// X void demo(List<X extends B> list) {} // invalid

	// <X> void demo(List<X extends B> list) {} // invalid

	<X> void demo(List<? extends X> list) {} // valid

	<X> void demo2(List<? extends B> list) {} // valid

	// X void demo2(List<? extends B> list) {} // invalid

	void demo3(List<? extends B> list) {} // valid

	// ############################################################################
}