package com.logics.et3;

import java.util.ArrayList;

public class _17 {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<>();
		
//		a1.add(111);  // error
		
		System.out.println(a1.indexOf(1.0));
		
		System.out.println(a1.contains("string"));
		
		Double d = a1.get(a1.size());
		
//		Double d = a1.get(a1.length);// error
	}
}
