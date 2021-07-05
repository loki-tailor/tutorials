package com.inheritance.demo2.certification;

/*-
	created @ 29-03-20
	@author lokeshwar

	Demo'ing "Protected" access modifier from pg.39 (OCA Sierra bk)
*/

public class Parent {
	protected int x = 9; // protected access
} // end of class

/*-	ERROR 1: 

	WHEN "Parent" class is not compiled and we comiple "Child" Class,
	THEN We get below error:

	./com/inheritance/demo2/certification/Parent.java:1: error: <identifier> expected
	package class com.inheritance.demo2.certification;
	       ^
	./com/inheritance/demo2/certification/Parent.java:1: error: class, interface, or enum expected
	package class com.inheritance.demo2.certification;
		      ^
	com/inheritance/demo2/other/Child.java:8: error: cannot access Parent
	import com.inheritance.demo2.certification.Parent;
                                          ^
	  bad source file: ./com/inheritance/demo2/certification/Parent.java
	    file does not contain class com.inheritance.demo2.certification.Parent
	    Please remove or make sure it appears in the correct subdirectory of the sourcepath.
*/
