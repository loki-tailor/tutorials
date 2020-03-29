package com.abstract_classes.demo3;

/*-
	created @ 29-03-20
	@author lokeshwar
	
	Demo'ing Abstract Methods, pg. 47 of OCAJP Sierra bk.
*/

public abstract class Car {
	void startEngine() {}
	abstract void goForward();
	abstract void reverse();
	void stop() {}
	abstract void turn(int whichway);	
} // end of class
