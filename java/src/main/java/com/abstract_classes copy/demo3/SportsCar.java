package com.abstract_classes.demo3;

/*-
	created @ 29-03-20
	@author lokeshwar
	
	Demo'ing Abstract Methods, pg. 47 of OCAJP Sierra bk.
*/

public class SportsCar extends Car {
	void startEngine() { } // optional 
	void goForward() { } // required
	void reverse() { } // required 
	void turn(int whichWay) { } // required
} // end of class
