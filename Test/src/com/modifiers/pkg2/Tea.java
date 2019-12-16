package com.modifiers.pkg2;

import com.temp.cert.*;

public class Tea {
	public static void main (String[] args) {
		System.out.println("Inside Tea which is instantiating Beverage Object");
		new Beverage().bm();
	}
}
