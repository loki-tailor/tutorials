package com.abstract_classes.demo3;

/*-
	created @ 29-03-20
	@author lokeshwar
	
	Demo'ing Abstract Methods, pg. 47 of OCAJP Sierra bk.
*/

public class AcmeRover extends SUV {
	void enable4wd() { } // optional
	void goOffRoad() { } // required
	void turn(int whichWay) { } // required
}
