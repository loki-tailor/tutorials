package com.logics.t8;

import java.math.BigDecimal;
import java.util.List;

public class Eg2 {

    // ******************************************************************************************
    interface ProductFilter {
        boolean accept(Product p);
    }

    // ******************************************************************************************
    private static void printProducts(List<Product> products, ProductFilter filter) {
        for (Product p : products) {
            if (filter.accept(p)) {
                System.out.println(p);
            }
        }
    }

    // ******************************************************************************************
    private static void printProducts(List<Product> products, BigDecimal priceLimit) {
        for (Product p : products) {
            if (p.getPrice().compareTo(priceLimit) < 0) {
                System.out.println(p);
            }
        }
    }

    // ******************************************************************************************

    public static void main(String[] args) {

        List<Product> list = ExampleData.getProducts();

        BigDecimal priceLimit = BigDecimal.valueOf(5.0);
        // priceLimit = BigDecimal.valueOf(5.0); // will will give compile error in
        // lambda expression, as now priceLimit is
        // not effectively final i.e. being assigned only oncec

        printProducts(list, priceLimit);

        ProductFilter filter = p -> p.getPrice().compareTo(priceLimit) < 0;

        printProducts(list, filter);

    }
}
