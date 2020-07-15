package com.inheritance;

/*-
	@author lokeshwar @created 11-07-20

	---------------------------------------------------------------------------------------------------------

	* Permissible 'return type' depends primarily on whether we are overriding, overloading, or,
	  declaring a new method.
	
	* When a subtype wants to change the method implementation of an inherited method (an override),
	  the subtype must define a method that matches the inherited version exactly. Or, since Java 5,
	  you're allowed to change the return type in the overriding method, as long as the new return type,
	  is a 'subtype' of the declared return type of the overridden (superclass) method 

	---------------------------------------------------------------------------------------------------------

	* Rules for returning a value:
	
	1. You can return null in a method with an object reference return type

	2. An array is a perfectly legal return type.

	3. In a method with a primitive return type, you can return any value or variable 
	that can be implicitly converted to the declared return type. Inshort, java's 'Autoboxig' 
	feature takes care of implicit conversion (or) the situation of converting 'char' to 'int'

	4. In a method with a primitive return type, you can return any value or variable that can
	be explicitly cast to the declared return type.

	5. You musr NOT return anything from a method with a void return type. 
	(Although you can return say 'return;'

	6. In a method with an object reference return type, you can return any object type that 
	can be implicitly cast to the declared return type.
	

	---------------------------------------------------------------------------------------------------------
*/

class A {
	A m1(char c) { return new A(); }
}

class B extends A {
	B m1(char c1) { return new B(); }
}

public class LegalReturnTypes {

	// -------------------------------------------------------------------
	public B rule_1() { return null; }

	// -------------------------------------------------------------------
	public String[] rune_2_i() { return new String[] { "a", "b", "c" }; }
	public String[] rune_2_ii() { 
		String[] s = { "a", "b", "c" };
		// return { "a", "b", "c" }; // compile error: error: illegal start of expression
		return s;

	}
	// -------------------------------------------------------------------
	public int rule_3() { 
		char c = 'a'; 
		return c; // char is compatible with int
	}

	// -------------------------------------------------------------------
	public int rule_4() {
		float pi = 3.14159f;
		return (int) pi;
	}

	// -------------------------------------------------------------------
	public void rule_5() {
		return; // legal
		// return "shimano"; // illegal, compile error: incompatible types: unexpected return value
	}

	// -------------------------------------------------------------------
	// RULE-6

	public Animal getAnimal() { return new Horse(); }
	public Object getObject() { int[] nums = {1,2,3}; return nums; } 

	interface Chewable{}
	class Gum implements Chewable {}
	class TestChewable {
		public Chewable getChewable() { return new Gum(); } // returns interface implementer 
	}	

	// -------------------------------------------------------------------

	class PrimitiveReturnsNullDemo {
		// int demo() { return null; } // compile error: error: incompatible types: <null> cannot be converted to int
	}
	
}

class Animal {}
class Horse extends Animal {}

