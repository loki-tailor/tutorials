package com.lambda_expressions;
/*
 * created @ Thu Jul 01 2021 8:35:26 am
 * ref @ 
 */

import java.math.BigDecimal;
import java.util.List;

import com.logics.t8.Category;
import com.logics.t8.ExampleData;
import com.logics.t8.Product;

public class MethodRefDemo {

    private static boolean isExpensive(Product p) {
        return p.getPrice().compareTo(BigDecimal.valueOf(10.0)) >= 0;
    }

    private static boolean isCheap(Product p) {
        return !isExpensive(p);
    }

    private static boolean isFood(Product p) {
        return Category.FOOD.equals(p.getCategory());
    }

    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        int i = products.size();

        products.forEach(MethodRefDemo::isExpensive); // does nothing i guess, if isExpensive had 2 args or different
                                                      // args, this would have given compiler error

        // ### method reference to a staic method
        // products.removeIf(MethodRefDemo::isExpensive);
        products.removeIf(MethodRefDemo::isCheap);
        // products.removeIf(MethodRefDemo::isFood);

        // ### method reference to a object's static object
        products.forEach(System.out::println); // System.out = object reference w-hich contains println()\

        // ### method reference to an instance method getName'
        products.forEach(Product::getName); // does nothing i guess
        products.stream().forEach(Product::getName); // also does nothing, duh !!
        products.stream().map(Product::getName).forEach(System.out::println);

        System.out.println("original size = " + i + " : present sie = " + products.size());

        // ### method reference to a constructor | usecase: when using
        // factory-design-pattern

        ProductFactory factory = Product::new;
        // ProductFactory MUST have only 1 method of any name but with same # of args as
        // that of constructors

    }

    interface ProductFactory {
        Product just_do_it(Category c, String name, BigDecimal price);
    }
}
