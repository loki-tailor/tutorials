package com.logics.t8;
/*
 * created @ Fri Jul 02 2021 7:51:01 am
 * ref @ 
 */

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Function;
import java.math.BigDecimal;

public class Eg4 {

	// ############################################################################################################

	private static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate) {
		for(Product product : products) {
			if(predicate.test(product)) {
				return Optional.of(product);
			}
		}
		
		return Optional.empty();
	}
	

	// ############################################################################################################

	public static void main(String[] args) {

		List<Product> products = ExampleData.getProducts();

		String name = "Spaghetti";

		// ############################################################################################################

		/*-

		// ## old way of consuming Optional
		Optional<Product> result = findProduct(products, product -> product.getName().equals(name));
		if(result.isPresent()) {
			Product found = result.get();
			System.out.println("product is as : " + found);
		}

		*/

		// ############################################################################################################

		// ## functional programming approach : 1 
		/*-
		findProduct(
			
			products, 

			product -> product.getName().equals(name))

			.map(Product::getPrice)

			.ifPresentOrElse(
				price -> System.out.printf("The price of %s is %.2f%n", name, price),
				() -> System.out.printf("%s is not available", name)
			);
		*/

		// ############################################################################################################

		/*-
		// ## functional programming approach : 2 : printing approach changed
		findProduct(
			
			products, 

			product -> product.getName().equals(name))

				.map(Product::getPrice)

				.map(price -> String.format("The price of %s is %.2f%n", name, price)) // method composition can be used with above

				.ifPresentOrElse(
					System.out::println,
					() -> System.out.printf("%s is not available", name)
			);
		*/

		// ############################################################################################################

		// ## functional programming approach : 3 : functional composition usage

		/*-		

		Function<Product, BigDecimal> productToPrice = Product::getPrice;

		Function<BigDecimal, String> priceToMessage = price -> String.format("The price of %s is %.2f%n", name, price);

		// ## method composition : approach 1
		// Function<Product, String> productToMessage = priceToMessage.compose(productToPrice); // evaluates arg first and the the calling function
		
		// ## method composition : approach 2
		Function<Product, String> productToMessage = productToPrice.andThen(priceToMessage); // evaluates the caller and then arg function

		Runnable err_not_available = () -> System.out.printf("%s is not available", name);

		findProduct(
		
			products,

			product -> product.getName().equals(name)

		).map(productToMessage)

  		 .ifPresentOrElse(

			System.out::println,

			err_not_avaialbe
		);

		*/

		// ############################################################################################################

		// ## functional composition : to do 2 filters
		
		BigDecimal limit = BigDecimal.valueOf(-10.0d);

		Predicate<Product> isFood = product -> product.getCategory() == Category.FOOD;

		Predicate<Product> isCheap = product -> product.getPrice().compareTo(limit) < 0;

		Function<Product, String> productToMsg2 = product -> String.format("%s is cheap food for $ %.2f%n", product.getName(), product.getPrice());

		Runnable err_no_cheap = () -> System.out.println("There are no cheap food products");

		findProduct(

			products,

			isFood.and(isCheap)

		).map(productToMsg2)
		 .ifPresentOrElse(
			System.out::println,
			err_no_cheap
		); 
			
		

			
    	} // main-end

} // class-end
