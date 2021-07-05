package com.streams;
/*
 * created @ Mon Jul 05 2021 6:47:03 am
 * ref @ 
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.logics.t8.Category;
import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class CollectorStreamEg3 {
        public static void main(String[] args) {

                List<Product> products = ExampleData.getProducts();

                Map<Category, List<Product>> collect = products.stream().collect( //
                                Collectors.groupingBy(// collector
                                                Product::getCategory// classifier
                                ));

                Map<Category, List<String>> collect2 = products.stream().collect(//
                                Collectors.groupingBy(//
                                                Product::getCategory, // classifier,
                                                Collectors.mapping(Product::getName, Collectors.toList()) // downstream
                                ));
                System.out.println(collect);
                System.out.println();
                System.out.println(collect2);

                products.stream().collect( //
                                Collectors.groupingBy(//
                                                Product::getCategory, //
                                                Collectors.mapping( //
                                                                Product::getPrice, //
                                                                Collectors.reducing(BigDecimal.ZERO, BigDecimal::add)) //
                                )//
                );//
        }
}
