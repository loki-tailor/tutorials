package com.abstract_classes.demo1;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

public abstract class Vehicle {
	private String type;
	public abstract void goUpHill(); // abstract method
	public String getType() { return type; } // non-abstract method
} // end of class
