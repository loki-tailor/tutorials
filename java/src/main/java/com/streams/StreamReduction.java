package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.logics.t8.Category;
import com.logics.t8.ExampleData;
import com.logics.t8.Product;


public class StreamReduction {
	
	public static void main(String[] args) {
		
		List<Product> products = ExampleData.getProducts();

		// ## bad way to use functional programming concept
		List<String> foodProductList = new ArrayList<>();

		products.stream()
			.filter(p -> p.getCategory() == Category.FOOD)
			.map(Product::getName)
			.forEach(foodProductList::add);
		/*-
			* in above approach
			* the list is getting modified while iterating
			* unsafe way to add data to list
			* will cause issue when using parallelStream [if  not used correctly] 

		*/
		foodProductList.forEach(System.out::println);
		System.out.println();

		// ################################################################################

		// #2 good way to collect a list after filtering & transforming
		foodProductList.clear();
		foodProductList = products.stream()
			.filter(p -> p.getCategory() == Category.FOOD)
			.map(Product::getName)
			.collect(Collectors.toList());
		foodProductList.forEach(System.out::println);

		// ################################################################################

		// ## 3 : reducing NOT as list	+ distinct
		String cats = products.stream()
			.map(Product::getCategory) // Stream<Category>
			.distinct()
			.map(Category::name) // Stream<String>
			.collect(Collectors.joining("; "));
		System.out.println();
		System.out.println(cats);
		
	}
}