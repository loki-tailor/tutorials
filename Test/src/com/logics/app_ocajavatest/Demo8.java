package com.logics.app_ocajavatest;

/**
	created @ 26-01-2020
	@author lokeshwar

	TARGET: Print 50 using constructor statement
*/

public class Demo8 {
	int numSpots;
	public Demo8(int numSpots) {
		// INSERT HERE
		//this.numSpots = numSpots; // VALID
		//super.numSpots = numSpots; // INVALID err = cannot find symbol numSpot in super
		//numSpots = numSpots; // INVALID
		//numSpots = this.numSpots; // INVALID
		//numSpots = super.numSpots; // INVALID err = same as #2
	}
	public static void main(String[] args) {
		System.out.println(new Demo8(50).numSpots);
	}
}