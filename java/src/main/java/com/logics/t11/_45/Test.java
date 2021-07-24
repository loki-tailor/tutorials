package com.logics.t11._45;

abstract class Traveller {
	
	void travel(String place) { System.out.print("abstract Traveller: inside travel(String) @ " + place); }
}

abstract class BeachTraveller extends Traveller {

	/* INSERT */

	// void travel(String beach) throws java.io.IOException {} // error: overridden method does not throw IOException

	public void travel(Object obj) { System.out.print("abstract BaseTraveller: inside travel(Object) @ " + obj); } // method overloading

	// abstract void travel(String beach); // no error: but won't be able to invokein 'Test' class

	// public abstract void travel(); // no error: but won't be able to invokein 'Test' class

	// public void travel() throws RuntimeException {}

	// public void travel() throws Exception {} // no error: since super-class has a different method signature: method overloading

	// public void travel(String beach) throws Exception {} // error

	abstract void travel(); // method overloading: no error

	
} 

public class Test extends BeachTraveller {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("sb-builder");
		Traveller tr = new Test();
		Test test = new Test();

		// tr.travel(tr); // error 'tr' cannot be converted to String, could be because reference-type is abstract & does not know instance method travel(Obj..)

		System.out.print("tr.travel(\"loki\") : ");
		tr.travel("loki"); // no error
		System.out.println("\n");

		// tr.travel(sb); // error: StringBuilder cannot be converted to String

		System.out.print("test.travel(tr);");
		test.travel(tr); // no error
		System.out.println("\n");

		System.out.print("test.travel(\"loki2\");");
		test.travel("loki2"); // no error
		System.out.println("\n");

		System.out.print("test.travel(sb);");
		test.travel(sb); // no error
		System.out.println("\n");



	}
}