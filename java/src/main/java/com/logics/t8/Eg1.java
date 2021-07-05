package com.logics.t8;

import java.util.Comparator;
import java.util.List;

import java.util.function.;

public class Eg1 {

    private static final List<Product> products = ExampleData.getProducts();

    // ##############################################################################################################
    public static void main(String[] args) {
        // two();
        three();

        products.forEach(p -> System.out.println(p));
    }

    // ##############################################################################################################
    public static void three() {

        // ascending order price
        // products.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())); //

        // descending order price\
        // products.sort((p1, p2) -> p2.getPrice().compareTo(p1.getPrice())); //

        // no affect on original list
        // products.sort((p1, p2) -> p1.getPrice().intValue());

    }

    // ##############################################################################################################
    public static void two() {

        // sort based on price
        // NOTE: even thought the list is final it is sorted
        // disadvantage syntax is verbose
        //
        products.sort(new Comparator<Product>() { // plumbing code
            @Override // plumbing code
            public int compare(Product p1, Product p2) { // plumbing code

                // return p1.getPrice().compareTo(p2.getPrice()); // ascending order // b logic

                return p2.getPrice().compareTo(p1.getPrice()); // descending order // business logic

            } // plumbing code
        }); // plumbing code
    }

    // ##############################################################################################################
    public static void one(String[] args) {

        List<Product> products = ExampleData.getProducts();

        for (Product p : products) {
            System.out.println(p);
        }

        /*-
        output:
        
            FOOD       Oranges          $   1.65
            FOOD       Gouda cheese     $   6.79
            UTENSILS   Plates           $  12.95
            CLEANING   Detergent        $   3.79
            FOOD       Soft drink       $   1.99
            OFFICE     Pencils          $   5.79
            FOOD       Rice             $   2.99
            CLEANING   Scourer          $   2.29
            FOOD       Milk             $   1.39
            OFFICE     Notebook         $   4.99
            FOOD       Tea              $   4.29
            FOOD       Tomato sauce     $   1.39
            FOOD       Peanut butter    $   2.39
            FOOD       Red bell pepper  $   0.99
            UTENSILS   Spoons           $  14.95
            OFFICE     Adhesive tape    $   5.39
            CLEANING   Dish brush       $   3.49
            UTENSILS   Knives           $   9.95
            FOOD       Brown bread      $   3.99
            FOOD       Potatoes         $   1.59
            CLEANING   Dishcloth        $   2.59
            FOOD       Apples           $   1.29
            OFFICE     Ballpoint pens   $   6.79
            FOOD       Spaghetti        $   2.79
            UTENSILS   Forks            $  14.95
            UTENSILS   Paper towel      $   3.69
            FOOD       Coffee           $   7.49
            OFFICE     Highlighter      $   2.29
            FOOD       Orange juice     $   3.49
            FOOD       Spring water     $   0.99
        */
    }
    // ##############################################################################################################
}
