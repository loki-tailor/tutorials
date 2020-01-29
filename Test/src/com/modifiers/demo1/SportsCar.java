package com.modifiers.demo1;

/**
	created @ 29-01-2020
	@author lokeshwar
*/

class SportsCar {
	private void goFast() { System.out.println("inside goFast()"); }
	private void doStuff() { goFast(); }
}

class Convertible extends SportsCar {
	public void doThings() {
		SportsCar sc = new SportsCar();
		// sc.goFast(); // compile error as "goFast() has private access in SportsCar"		
	}
	public void doMore() { doFast(); } // error = cannot find symbol doFast() in class Convertible
}

class Driver {
	public void doDriverStuff() {
		SportsCar car = new SportsCar();
		car.goFast(); compile error as "goFast() has private access in SportsCar"		

		Convertible con = new Convertible();
		con.goFast(); // error = cannot find symbol doFast() in class Convertible
	}
}