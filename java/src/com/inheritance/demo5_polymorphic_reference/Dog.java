package com.inheritance.demo5_polymorphic_reference;

/*-
 * 	@author lokeshwar @created 09-07-2020
 * 
 * 	"If a method is overridden but we use a polymorphic (supertype) reference
 * 	to refer to the subtype object with the overriding method, the compiler assumes that
 * 	we're calling the supertype version of the method. If the supertype version declares
 * 	a checked exception, but the overriding subtype method does not, the compiler still
 * 	thinks that we are calling a method that declares an exception"

	-----------------------------------------------------------------------------------------------------------------
	OUTPUT :- 
	   com/inheritance/demo5_polymorphic_reference/Dog.java:18: error: unreported exception Exception; must be caught or declared to be thrown
		a.eat(); // compile error - 
		     ^
		1 error
	-----------------------------------------------------------------------------------------------------------------
 */

class Animal {
    public void eat() throws Exception {
    }
}

public class Dog extends Animal {
    public void eat() {
    }

    public static void main(String[] args) {
	Animal a = new Dog();
	Dog d = new Dog();
	d.eat();

	// a.eat(); // compile error
    }
}
