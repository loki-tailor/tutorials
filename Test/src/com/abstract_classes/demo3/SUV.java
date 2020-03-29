package com.abstract_classes.demo3;

/*-
	created @ 29-03-20
	@author lokeshwar
	
	Demo'ing Abstract Methods, pg. 47 of OCAJP Sierra bk.
*/

public abstract class SUV extends Car {
	void enable4wd() { }
	void goForward() { }
	void reverse() { }
	abstract void goOffRoad();
} // end of class
