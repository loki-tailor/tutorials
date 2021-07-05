package com.inheritance.static_keyword_demo;

/*-
	@created 14-10-2020

	* Static methods can't be overridden. This doesn't mean they can't be redefined in a subclass,
	but redefining and overriding aren't the same thing. 

	OUTPUT: a a a d 
*/

class Animal {
	static void doStuff() { System.out.print("a "); }
}

class Dog extends Animal {
	static void doStuff() { System.out.print("d "); } // it's a redefinition, not an override
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal()};
		for(int x = 0; x < a.length; x++) {
			a[x].doStuff(); // invoke the static method
		}
		Dog.doStuff(); // invoke using class name
	}
}


