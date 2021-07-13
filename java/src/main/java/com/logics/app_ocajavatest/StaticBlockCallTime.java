package com.logics.app_ocajavatest;
/*
 * created @ Mon Jul 12 2021 9:40:17 am
 * ref @ 
 */

import java.time.LocalDate;

class A {
    static String temp = "in A";
}

class B extends A {
    int a = 10;
    static int b = 20;
    static {
        b = 30;
        System.out.println("in B");
    }
}

public class StaticBlockCallTime {
    public static void main(String[] args) {
        System.out.println(B.temp);
        System.out.println(B.b);
    }
}

/*-
When initilization occurs A class or interface type T will be initialized immediately before the first occurrence of any of the following:

* T is a class and instance of T is created
* T is a class and a static method delcared by T is invokeed
* A static field declared by T is assigned
* A static field declared by T is used and the field is not a constant variable
* T is a top level class, and an assert statement lexically nested within T is executed

*/