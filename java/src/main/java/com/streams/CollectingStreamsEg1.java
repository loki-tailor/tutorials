package com.streams;
/*
 * created @ Sun Jul 04 2021 7:13:13 am
 * ref @ 
 */

import java.util.ArrayList;
import java.util.List;

import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class CollectingStreamsEg1 {
    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        // ## not recommended, but done to understand the reduce() for creating a list

        // ####################################################################################
        // ## original list
        products.forEach(System.out::println);
        System.out.println("*".repeat(100));

        // ####################################################################################
        // #1 : reduction
        List<String> reduce = products.stream().reduce(

                new ArrayList<>(), // identity, //

                (list, product) -> {
                    list.add(product.getName()); // # not right : as immutable : somehow working not sure why
                    return list;
                }, // accumulator, //

                (list1, list2) -> {
                    list1.addAll(list2); // ## not right : as immutable : somehow working not sure why
                    return list2;
                } // combiner) //
        );

        reduce.forEach(System.out::println);
        System.out.println("*".repeat(100));

        // ####################################################################################
        // # 1 : same as earlier, but original one used
        List<String> r2 = products.stream().reduce(

                new ArrayList<>(), // identity, //

                (list, product) -> {
                    ArrayList<String> newList = new ArrayList<>(list);
                    newList.add(product.getName());
                    return newList;
                }, // accumulator, //
                (list1, list2) -> {
                    ArrayList<String> newList = new ArrayList<>(list1);
                    newList.addAll(list2);
                    return newList;
                } // combiner) //
        );

        r2.forEach(System.out::println);
        System.out.println("*".repeat(100));

        // ####################################################################################
        // # 2 : collectors approach
        ArrayList<String> r3 = products.stream().collect(ArrayList::new, //
                (list, product) -> list.add(product.getName()), //
                ArrayList::addAll);

        r3.forEach(System.out::println);
        System.out.println("*".repeat(100));

        // ####################################################################################
    }
}
