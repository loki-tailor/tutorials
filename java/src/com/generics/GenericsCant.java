package com.generics;

/*- generics cant
#1 - can't call a constructor
#2 - create an array of that generic type
#3 - call instanceof
#4 - use primitive type as generic type parameter
#5 - create a static variable as a generic type parameter
*/

public class GenericsCant <T, U> {
// ########################################################################################################################

	private T t;
	private U u;
	private T arr[];

	// private static T constant; // error: non-static type variable T cannot be referenced from a static context

	public GenericsCant() {} // no error
// ########################################################################################################################
	
	// public GenericsCant(T t) { this();} // no error
	// public GenericsCant(U u) { } // error as below

	/*-
		when we have a arg constructor with either T or U, we get below error:
$ javac com/generics/GenericsCant.java
com\generics\GenericsCant.java:11: error: name clash: GenericsCant(U) and GenericsCant(T) have the same erasure
        public GenericsCant(U u) {  }
               ^
  where U,T are type-variables:
    U extends Object declared in class GenericsCant
    T extends Object declared in class GenericsCant
1 error
*/

// ########################################################################################################################

	// #1 demonstrated
	// public GenericsCant(T t) { this(); Object o = new T(); } // error
	/*- above will give below error:
$ javac com/generics/GenericsCant.java
com\generics\GenericsCant.java:24: error: unexpected type
        public GenericsCant(T t) { this(); Object o = new T(); } // no error
                                                          ^
  required: class
  found:    type parameter T
  where T is a type-variable:
    T extends Object declared in class GenericsCant
1 error

*/

// ########################################################################################################################
	// #2 demonstrated
	// public void demo() { this.arr = new T[4]; }
	/*- above will give below error:
$ javac com/generics/GenericsCant.java
com\generics\GenericsCant.java:52: error: generic array creation
                this.arr = new T[4];
                           ^
1 error

*/
// ########################################################################################################################
	// #3 demonstrated
	// public void demo3() { if(t instanceof T) {} }
	
	/*- above will give below compile error:
$ javac com/generics/GenericsCant.java
com\generics\GenericsCant.java:64: error: illegal generic type for instanceof
        public void demo3() { if(t instanceof T) {} }
                                              ^
1 error

*/
// ########################################################################################################################
	// #4 demonstrated
	public static void main(String[] args) {
		GenericsCant<String, Integer> a = new GenericsCant<>(); // no error

		// GenericsCant<String, int> b = new GenericsCant<>(); // error as below
		/*-
com\generics\GenericsCant.java:79: error: unexpected type
                GenericsCant<String, int> b = new GenericsCant<>(); // error as below
                                     ^
  required: reference
  found:    int
1 error

*/
	}
// ########################################################################################################################
}