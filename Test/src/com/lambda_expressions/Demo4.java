package com.lambda_expressions;

/**
	created @ 25-01-2020
	@author lokeshwar

	Demonstration of valid and invalid usage of lambda expressions
*/

import java.util.List;
import java.util.ArrayList;

public class Demo4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();		

		//list.removeIf(String s -> s.isEmpty()); // invalid
		list.removeIf((String s) -> s.isEmpty()); // valid
		//list.removeIf(s -> {s.isEmpty();} ); // invalid
		list.removeIf(s -> {return s.isEmpty();} ); // valid
		list.removeIf(s -> s.isEmpty()); // valid
		//list.removeIf(s -> {s.isEmpty()}); // invalid
	}
}