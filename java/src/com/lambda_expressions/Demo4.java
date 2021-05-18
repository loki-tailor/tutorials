package com.lambda_expressions;

import java.util.ArrayList;

/**
	created @ 25-01-2020
	@author lokeshwar

	Demonstration of valid and invalid usage of lambda expressions
*/

import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();		

		//list.removeIf(String s -> s.isEmpty()); // invalid, parentheses required around type
		list.removeIf((String s) -> s.isEmpty()); // valid
		//list.removeIf(s -> {s.isEmpty();} ); // invalid // return statement required
		list.removeIf(s -> {return s.isEmpty();} ); // valid
		list.removeIf(s -> s.isEmpty()); // valid
		//list.removeIf(s -> {s.isEmpty()}); // invalid // return statement required
	}
}