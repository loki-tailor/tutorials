package com.streams;

import java.util.List;
import java.util.Optional;

import com.logics.t8.Product;
import com.logics.t8.ExampleData;
import com.logics.t8.Category;

public class StreamsSearching {

	public static void main(String[] args) {

		List<Product> products = ExampleData.getProducts();

		// #1
		Optional<Product> res = products.stream().filter(p -> p.getCategory() == Category.FOOD)
				// .findAny();
				.findFirst();

		res.ifPresentOrElse(System.out::println, () -> System.out.println("no match found"));
		res.ifPresent(System.out::println);
		System.out.println();

		// ################################################################################################

		// #2
		boolean res2 = products.stream().anyMatch(p -> p.getCategory() == Category.FOOD);
		System.out.println("does list contain atleast 1 FOOD product? : " + res2);

		// ################################################################################################

		// #3
		java.math.BigDecimal limit = java.math.BigDecimal.valueOf(10.00d);
		boolean res3 = products.stream().allMatch(p -> p.getPrice().compareTo(limit) < 0);
		System.out.println("are all products cheap ? : " + res3);

		// ################################################################################################

		// #4
		boolean res4 = products.stream().noneMatch(p -> p.getPrice().compareTo(limit) < 0);
		System.out.println("are all products expensive? : " + res4);

	}
}