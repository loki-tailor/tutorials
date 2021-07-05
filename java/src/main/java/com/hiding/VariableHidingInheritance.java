package com.hiding;

/*-
	@created 11-07-20

	ref: https://www.baeldung.com/java-variable-method-hiding

	----------------------------------------
	Output: 

	parent variable
	child variable
	----------------------------------------
*/

class Parent {
	String instanceVar = "parent variable";
	public void print() { System.out.println(instanceVar); }
}

class Child extends Parent {
	private String instanceVar = "child variable";
	// public void print() { System.out.println(instanceVar); }
}

public class VariableHidingInheritance {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p.print(); c.print();	
	}
}
