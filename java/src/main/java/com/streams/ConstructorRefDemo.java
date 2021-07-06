package com.streams;
/*
 * created @ Tue Jul 06 2021 6:20:28 am
 * ref @ https://dzone.com/articles/java-lambda-method-reference
 */

import java.util.function.ObjIntConsumer;

@FunctionalInterface
interface CustomIntSupplier {
    ConstructorRefDemo apply(int n);
}

@FunctionalInterface
interface CustomIntObjectSupplier {
    ConstructorRefDemo apply(ConstructorRefDemo obj);
}

public class ConstructorRefDemo {

    private int num;

    public ConstructorRefDemo(int num) {
        this.num = num;
    }

    public ConstructorRefDemo(ConstructorRefDemo n) {
        this.num = n.num;
    }

    public static void main(String[] args) {

        // using int supplier functional interface
        int num = 10;
        CustomIntSupplier s1 = ConstructorRefDemo::new;
        ConstructorRefDemo o1 = s1.apply(num);
        System.out.println("1 : " + o1.num);

        // using the int object supplier functional interface
        CustomIntObjectSupplier s2 = ConstructorRefDemo::new;
        ConstructorRefDemo o2 = s2.apply(o1);
        System.out.println("2 : " + o2.num);

    }

}
