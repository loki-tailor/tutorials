package com.streams;
/*
 * created @ Sat Jul 03 2021 5:30:20 pm
 * ref @ 
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class StreamReduceDemo {
        public static void main(String[] args) {

                List<Product> products = ExampleData.getProducts();

                // ################################################################################################
                // ## approach 1
                Optional<BigDecimal> reduce = products.stream() //
                                .map(Product::getPrice) //
                                .reduce(BigDecimal::add);

                reduce.ifPresentOrElse(
                                total -> System.out.printf("The total value of all products is : $ %.2f%n", total),
                                () -> System.out.println("there are no products..."));

                // ################################################################################################
                // ## approach 2
                BigDecimal reduce2 = products.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
                System.out.printf("The total value of all products is : $ %.2f%n", reduce2);

                // ################################################################################################
                // ## approach 3 : main reason when below is used for is during parallell
                // streams
                BigDecimal reduce3 = products.stream().reduce( //

                                BigDecimal.ZERO, // identity,

                                (result, product) -> result.add(product.getPrice()), // accumulator,

                                BigDecimal::add// combiner : combine data from multiplel threads
                );
                System.out.printf("The total value of all products is : $ %.2f%n", reduce3);

        }
}
