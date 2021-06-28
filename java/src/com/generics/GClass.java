package com.generics;

public class GClass <T> {

	// public static T t;
	/*- above will give below error:
		.\com\generics\GClass.java:4: error: non-static type variable T cannot be referenced from a static context
		        public static T var_generic_static;
		                      ^
		1 error
	*/

	public T t;

	GClass(T t) { this.t = t; }

	public T getT() { return this.t; }

	public void setT(T t) { this.t = t; }
}

class CreateA <TA> { // will complie

	public TA t;

	public TA getT() { return this.t; }
}

/*-
Naming Convention:

* E - element
* K - map key
* V - map value
* N - number
* T - generic data type
* S, U, V, and so forth - multiple generic types
*/