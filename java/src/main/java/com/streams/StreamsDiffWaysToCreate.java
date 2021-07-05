package com.streams;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

import java.util.stream.Stream;
import java.util.stream.IntStream;

import com.logics.t8.Product;
import com.logics.t8.ExampleData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class StreamsDiffWaysToCreate {
	public static void main(String[] args) {
		System.out.println("execution completed");

		List<Product> products = ExampleData.getProducts();
		
		// #1
		Stream<Product> s1 = products.stream();

		// #2
		String[] arr = new String[] { "one", "two", "three" };
		Stream<String> s2 = Arrays.stream(arr);

		// #3
		Stream<String> s3 = Stream.of("one", "two", "three");
		
		// #4
		Stream<String> s4 = Stream.ofNullable("four");

		// $5
		Stream<?> s5 = Stream.empty();

		// #6
		IntStream dice = new Random().ints(1, 7); // start inclusive, end exclusive
		// above Returns an effectively unlimited stream of pseudorandom int values, each conforming to the given origin (inclusive) and bound (exclusive)

		// dice.forEach(System.out::println); // infinite loop

		// #7
		try (BufferedReader br = new BufferedReader(new FileReader("../resources/demo.txt", StandardCharsets.UTF_8))) {
			br.lines().forEach(System.out::println);
		} catch(IOException e) { e.printStackTrace(); }
	}
}