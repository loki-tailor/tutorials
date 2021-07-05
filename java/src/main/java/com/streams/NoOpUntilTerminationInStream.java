package com.streams;

import java.util.List;
import com.logics.t8.Product;
import com.logics.t8.ExampleData;

public class NoOpUntilTerminationInStream {
	public static void main(String[] args) {
		List<Product> products = ExampleData.getProducts();	

		// products.stream().map(product -> { System.out.println(product);	}); 
		// above: compile error as there is no return type since map takes a Function which requires 1 input and 1 output

		// products.stream().map(product -> { System.out.println(product); return product; }); 
		/*- above will give no output because:
			* stream has only intermediate operation
			* there is no termination operation
			* hence no output
		*/

		products.stream().map(product -> { System.out.println(product); return null; }).forEach( product -> {});
		/*-
			* null can be returned as we are not consuming the return of map in forEach
			* empty lambda as required operations are performed in the map 'Function' itself
		*/
	

		System.out.println("execution completed");
	}
}