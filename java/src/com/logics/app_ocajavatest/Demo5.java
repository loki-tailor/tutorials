package com.logics.app_ocajavatest;

/**
	created @ 23-01-2020
	@author lokeshwar
*/

import java.util.ArrayList;

public class Demo5 {
	public static void main(String args[]) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1,6);
		values.remove(0);
		for (Integer v : values) System.out.println(v);
	}
}