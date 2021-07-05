package com.casting;

/*-
	@author lokeshwar @created 10-07-2020

	* Unlike downcasting, upcasting (casting up the inheritance tree to a more
	  general type) works implicitly (that is, we don't have to type in the cast)
	  because when we upcast we're implicitly restricting the number of methods 
	  we can invoke, as opposed to downcasting, which implies later on, we might want
	  to invoke a more specific method.

	* The compiler and JVM nows, the implicit upcast is always legal for assigning an object
	  of a subtype to a reference of one of its supertype classes (or interfaces).

	* If any supertype in its inheritance tree has already proided concrete (i.e. nonabstract)
  	  method implementations, then regardless of whether the supertype declares that it 
	  implements the interface, the subclass is under no obligation to reimplement (override)
	  those methods.

	* OBSERVATION: 
		- Preference is given to 'supertype' of 'Class' first and the 'interface'
		- 'default' method of interfaces should have the same method signature including return-type, else compile error comes.
*/

class Animal {

	// public void beFriendly() { System.out.println("ANIMAL - beFriendly from - " + this.getClass().getCanonicalName()); }

	// public int beFriendly() { return 0; } // compile error if above is not commented:method beFriendly() is already defined in class Animal
	// public int beFriendly() { return 0; } // compile error if all above is commented:beFriendly() in Animal cannot implement beFriendly() in Pet

	public void beFriendly(int i) { System.out.println("ANIMAL - beFriendly(int) from - " + this.getClass().getCanonicalName()); }
}

class Dog extends Animal implements Pet {
	public void beFriendly(int i) { System.out.println("DOG - beFriendly(int) from - " + this.getClass().getCanonicalName()); }
	public void beFriendly() { System.out.println("DOG - beFriendly from - " + this.getClass().getCanonicalName()); }
}

interface Pet {
	public default void beFriendly() { System.out.println("PET - beFriendly from - " + this.getClass().getCanonicalName()); }
	public void beFriendly(int i);
}

class Beagle extends Dog implements Pet {}

class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a1 = d;		// upcast ok with no explicit cast
		Animal a2 = (Animal) d; // upcast ok with an explicit cast

		Pet p1 = (Pet) d;
		//p1.beFriendly(10);		

		Beagle b = new Beagle();
		b.beFriendly();
	}
}
