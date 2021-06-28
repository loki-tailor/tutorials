package com.generics;

// ############################################################################################################
// no compile error

interface Shippable <T> {
	void ship(T t);
}

// ############################################################################################################

// no compile error

class Mobile {}
class ElectronicDevices implements Shippable<Mobile> {

	@Override
	public void ship(Mobile m) { System.out.println("mobile is shippable"); }
}

// ############################################################################################################

abstract class Ornaments implements Shippable {} // no compile error

// ############################################################################################################

public class GenericsInInterface {
	public static void main(String[] args) {
		System.out.println("execution completed");
	}
}