package com.streams;
/*
 * created @ Mon Jul 05 2021 6:32:30 am
 * ref @ 
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.logics.t8.Category;
import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class ColectorStreamEg2 {
    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        Map<Category, BigDecimal> collect = products.stream().collect(Collectors.toMap( //
                Product::getCategory, // keyMapper,
                Product::getPrice, // valueMapper,
                BigDecimal::add // mergeFunction : decides what to do with duplicate key, performs this
                                // operatioon on the value of duplicate key and then merges them
        ));

        System.out.println(collect);
    }

}
