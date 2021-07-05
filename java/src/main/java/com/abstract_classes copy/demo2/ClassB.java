package com.abstract_classes.demo2;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

class ClassB extends ClassA {
	void foo(int i) { }
	void foo() {} // if we COMMENT this, compilation error will go
}

/*- COMPILATION error will come if we don't define void foo() {} method

	com/abstract_classes/demo2/ClassB.java:8: error: B is not abstract and does not override abstract method foo() in ClassA
	class B extends ClassA {
	^
	1 error
*/
