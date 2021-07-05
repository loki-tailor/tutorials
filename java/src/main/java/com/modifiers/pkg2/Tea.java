package com.modifiers.pkg2;

import com.modifiers.pkg1.Beverage;
public class Tea {
	public static void main (String[] args) {
		System.out.println("Inside Tea which is instantiating Beverage Object");
		new Beverage().bm();
	}
}
