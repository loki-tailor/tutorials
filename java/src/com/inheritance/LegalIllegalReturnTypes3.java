package com.inheritance;

/*-
	@author lokeshwar @created 13-07-20

	- Check for legal / illegal return type:
	* Methods that declare an abstract class or interface return type
	* Know that any object that passes IS-A test (i.e. would test true using the instanceof operator, can be returned from that method.
*/

abstract class Animal {}
class Bear extends Animal {}
class Test {
	public Animal go() { return new Bear(); } // ok, since, Bear "is-a" / "instanceof" Animal

	public Bear go2() {
		Animal a = new Bear();
		// return a; // compile error: incompatible types: Animal cannot be converted to Bear
		return (Bear) a; // no error		
	}
}
