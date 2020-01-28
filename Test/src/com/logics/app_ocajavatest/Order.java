package com.logics.app_ocajavatest;

/**
	created @ 28-01-2020
	@author lokeshwar
*/

public class Order {
	String value = "t";
	{ value += "a"; }
	{ value += "c"; }
	public Order() {
		value += "b";
	}	
	public Order(String s) {
		value += s;
	}
	public static void main(String[] args) {
		Order order = new Order("f");
		order = new Order();
		System.out.println(order.value);
	}
} // end of class