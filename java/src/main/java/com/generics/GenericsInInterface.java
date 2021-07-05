package com.generics;

// ############################################################################################################
// no compile error

interface Shippable <T> {
	void ship(T t);
}

// ############################################################################################################

// ## APPROACH 1: implementing generic interface with some class type

// no compile error

class Mobile {}
class ElectronicDevices implements Shippable<Mobile> {

	@Override
	public void ship(Mobile m) { System.out.println("mobile is shippable"); }
}

// ############################################################################################################

// ## APPROACH 2 : implementing generic interface and making the class abstract

abstract class Ornaments implements Shippable {} // no compile error

// ############################################################################################################


// ## APPROACH 3 : implementing generic interface as generic, but declaring class is not declaring the formal-arg <U>

/*-

class Bikes implements Shippable <U> {
	@Override
	public void ship(U u) {}
}

*/

/*- above class with give compile error as below:
$ javac com/generics/GenericsInInterface.java
com\generics\GenericsInInterface.java:27: error: cannot find symbol
class Bikes implements Shippable <U> {
                                  ^
  symbol: class U
com\generics\GenericsInInterface.java:29: error: cannot find symbol
        public void ship(U u) {}
                         ^
  symbol:   class U
  location: class Bikes
2 errors

*/

// ############################################################################################################

// ## APPROACH 4 : implement generic interface in a generic class

// no compile error

class Cars <U> implements Shippable <U> {

	@Override
	public void ship(U u) { new Cars(); } // no error
}
// ############################################################################################################


// ## APPROACH 5 : Implement in old way : (Object class is considered as the class type in this case i.e. Raw Type : not use generic at-all

class Trains implements Shippable {
	@Override
	public void ship(Object c) {
		new Trains(); // no error
		// new Shippable(); error: // com\generics\GenericsInInterface.java:78: error: Shippable is abstract; cannot be instantiated
	}
}

// ############################################################################################################

public class GenericsInInterface {
	public static void main(String[] args) {
		System.out.println("execution completed");
	}
}