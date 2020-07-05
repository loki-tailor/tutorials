package com.logics.sierra_book.ST_ch1._2;

/**
	@author lokeshwar @created 05-07-2020

		x - As the code stands, the output is bang
	v - As the code stands, the output is sh-bang
		x - As the code stands, compilation fails
		x - If line A is uncommented, the output is bang bang
		x - If line A is uncommented, the output is sh-bang bang
	v - If line A is uncommented, compiation fails.
*/

class Rocket {
	private void blastOff() { System.out.print("bang "); }
}

public class Shuttle extends Rocket {
	public static void main(String[] args) {
		new Shuttle().go();
	}
	void go() {
		blastOff();
		Rocket.blastOff(); // line A
	}
	private void blastOff() { System.out.print("sh-bang "); }
}	
