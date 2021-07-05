package com.streams;

import java.util.List;
import java.util.stream.Stream;

import java.util.regex.Pattern;

import com.logics.t8.Product;
import com.logics.t8.ExampleData;
import com.logics.t8.Category;

public class StreamsFiltering {
	public static void main(String[] args) {
		
		List<Product> products = ExampleData.getProducts();

		// #1
		products.stream()
			.filter(product -> product.getCategory() == Category.FOOD) // returns a stream filter(Predicate<? super Product>)
			.forEach(System.out::println); // consumes the above stream forEach(Consumer<? super Product)
		System.out.println();

		// #2
		products.stream()
			.map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice())) // returns a new stream based on new Type
			.forEach(System.out::println);
		System.out.println();

		// #3
		Pattern spaces = Pattern.compile("\\s+");
		products.stream()
			.flatMap(product -> spaces.splitAsStream(product.getName())) // only names with each word on new line
			.forEach(System.out::println);


		// $4
		Stream<Stream<String>> s = products.stream().map(product -> spaces.splitAsStream(product.getName())); // stream of streams
		// or
		Stream<String> s_similar = products.stream().flatMap(product -> spaces.splitAsStream(product.getName())); // only streams & flatMap handles the nested streams

		System.out.println("execution completed");

		// .map() does 1-to-1 transformation => takes a input value & returns a single value as output
		// .flatMap() does 1-to-many transformation => takes a funtion that takes an input element and returns a stream of values
	}
}