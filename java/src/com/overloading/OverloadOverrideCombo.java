package com.overloading;

/*-
	@author lokeshwar @created 09-07-2020
*/

class HandleBar {
	public void handleBar() { System.out.println("Generic handlebar"); }
}

class Steering extends HandleBar {
	public void handleBar() { System.out.println("Carbon handlebar"); }
	public void handleBar(String s) { System.out.println(s + " handlebar"); }
}

public class OverloadOverrideCombo {	
	public static void main(String[] args) {
		HandleBar hb = new HandleBar();
		hb.handleBar(); // op: 'Generic handlebar'

		Steering s = new Steering();
		s.handleBar(); // op: 'Carbon handlebar'

		HandleBar hb2 = new Steering();
		hb2.handleBar(); // op: 'Carbon handlebar'

		Steering s2 = new Steering();
		s2.handleBar("custom-carbon"); // op: 'custom-carbon handlebar

		HandleBar hb3 = new HandleBar();
		// hb3.handleBar("custom-titanium"); // compile error

		HandleBar hb4 = new Steering();
		// hb4.handleBar("aluminium"); // compile error
	}
}
