package com.streams;
/*
 * created @ Mon Jul 05 2021 6:59:21 am
 * ref @ 
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class StreamPartitioningEg1 {
    public static void main(String[] args) {
        List<Product> list = ExampleData.getProducts();

        BigDecimal limit = BigDecimal.valueOf(5d);

        Map<Boolean, List<Product>> map = list.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice().compareTo(limit) < 0));

        System.out.println("cheap products");
        map.get(true).forEach(System.out::println);
        System.out.println();

        System.out.println("expensive products");
        map.get(false).forEach(System.out::println);

    }
}
