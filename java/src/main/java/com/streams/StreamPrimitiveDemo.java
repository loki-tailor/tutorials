package com.streams;
/*
 * created @ Mon Jul 05 2021 7:53:24 am
 * ref @ 
 */

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class StreamPrimitiveDemo {
    public static void main(String[] args) {
        List<Product> list = ExampleData.getProducts();

        DoubleStream mapToDouble = list.stream().mapToDouble(product -> product.getPrice().doubleValue());
        System.out.println(mapToDouble + "\n");

        double sum = mapToDouble.sum();
        System.out.println(sum + "\n");

        // below is requred else we get: Exception in thread "main"
        // java.lang.IllegalStateException: stream has already been operated upon or
        // closed
        mapToDouble = list.stream().mapToDouble(product -> product.getPrice().doubleValue());

        DoubleSummaryStatistics summaryStatistics = mapToDouble.summaryStatistics();
        System.out.println(summaryStatistics + "\n");

    }
}
