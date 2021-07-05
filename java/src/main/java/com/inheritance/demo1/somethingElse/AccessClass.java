package com.inheritance.demo1.somethingElse;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

import com.inheritance.demo1.certification.OtherClass;

class AccessClass {
	static public void main(String[] args) {
		OtherClass o = new OtherClass();
		
		// o.testIt();

		// above will give below compilation error, when OtherClass.testIt() has default access specifier 
		// & we try to user it here using instance of Otherclass:
		// com/inheritance/demo1/somethingElse/AccessClass.java:13: error: 
		// testIt() is not public in OtherClass; cannot be accessed from outside package

	} // end of main
} // end of class
