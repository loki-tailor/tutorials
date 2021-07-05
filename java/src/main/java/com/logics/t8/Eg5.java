package com.logics.t8;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Eg5{
	public static void main(String... args) {
		List<Product> products = ExampleData.getProducts();

		/*
		 	Problem Statement: 
				* creating a product list based on its category
				* i.e. create a map, where keys are the category and values are the list of products in that category

		*/

		HashMap<Category, List<Product>> map1 = new HashMap<>(); // products by category


		/*-
		// ## traditional approach
		for(Product product : products) {

			Category c = product.getCategory();

			if(!map1.containsKey(c))
				map1.put(c, new ArrayList<>());

			map1.get(c).add(product);
				

		} // loop-end
		*/

		// ## functional interface approach
		for(Product product : products) {
		
			map1
			   .computeIfAbsent(product.getCategory(), tmp -> new ArrayList<>())
                           .add(product);
		
		} // loop-end



		map1.forEach((k,v) ->  {
			System.out.println(k);
			v.forEach(System.out::println);
			System.out.println();
		}); 

	} // main-end

} // class-end