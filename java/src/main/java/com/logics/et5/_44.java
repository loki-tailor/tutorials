package com.logics.et5;

class Doll {
	String name;

	Doll(String name) {
		this.name = name;
	}
}

class Barbie extends Doll {
	Barbie() {
//		super(name); // error: Cannot refer to an instance field name while explicitly invoking a constructor

//		this.name = "";
//		super(this.name); // call to constructor must be 1st statement
		
//		String name = ""; super(name);  // /error call to constructor must be first statement

		super(""); // no error		
	}

	Barbie(String nm) {
		super(nm);
	}
}

public class _44 {

}
