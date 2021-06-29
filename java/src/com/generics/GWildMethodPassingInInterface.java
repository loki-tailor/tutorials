package com.generics;

/*- demonstrating upperbond - method passing - generics - for interfaces */

import java.util.List;
import java.util.ArrayList;

interface Flyer { void fly(); }

class HangGlider implements Flyer {
	@Override
	public void fly() {}
}

class Goose implements Flyer {
	@Override
	public void fly() {}
}

public class GWildMethodPassingInInterface {

	private static void anyFlyer(List<Flyer> f) {}

	private static void groupOfFlyers(List<? extends Flyer> f) {}


	public static void main(String[] args) {
	
		GWildMethodPassingInInterface flying = new GWildMethodPassingInInterface();

		List<Flyer> flyers = new ArrayList<>();
		flying.anyFlyer(flyers);
		flying.groupOfFlyers(flyers);

		List<Goose> geese = new ArrayList<>();
		// flying.anyFlyer(geese); // error
		flying.groupOfFlyers(geese);
		
		
		System.out.println("execution completed");
	}
}