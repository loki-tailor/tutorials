package com.logics.t3;

import java.time.Period;

/*
 * created @ Tue Jun 22 2021 2:46:51 pm
 * ref @ 
 */

public class _16_Test {
    public static void main(String[] args) {

        Period a = Period.of(2, 1, 0);
        System.out.println(a + " - Period.of(2, 1, 0)");

        Period b = Period.of(2, 1, 0).ofYears(10);
        System.out.println(b + " - Period.of(2, 1, 0)");

        Period c = Period.of(2, 1, 0).ofYears(10).ofMonths(5);
        System.out.println(c + " - Period.of(2, 1, 0).ofYears(10).ofMonths(5);");

        Period d = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(d + " - Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2)");
    }
}

/*-

Explanation
of and ofXXX methods are static methods and not instance methods.

Period.of(2, 1, 0) => returns an instance of Period type.

static methods can be invoked using class_name or using reference variable. In this case ofYears(10) is invoked on period instance but compiler uses Period's instance to resolve the type, which is period. A new Period instance {P10Y} is created, after that another Period instance {P5M} is created and finally Period instance {P2D} is created.

This instance is assigned to period reference variable and hence P2D is printed on to the console.

*/