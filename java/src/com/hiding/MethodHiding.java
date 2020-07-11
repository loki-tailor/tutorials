package com.hiding;

/*-
	@created 11-07-20

	ref: https://www.baeldung.com/java-variable-method-hiding

	----------------------------------------
	Output: 
	Parent.display()
	Child.display()
	----------------------------------------
*/

class Parent {
	public static void display() { System.out.println("Parent.display()"); }
}

class Child extends Parent {
	public static void display() { System.out.println("Child.display()"); }
}

public class MethodHiding {
	public static void main(String[] args) {
		Parent.display(); 
		Child.display();			
	}
}	
