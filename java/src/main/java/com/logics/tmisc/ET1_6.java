package com.logics.tmisc;

/*
 * created @ Wed Aug 18 2021 8:24:08 am
 * ref @ 
 */

public class ET1_6 {
    static int global;

    public static void main(String[] args) {
        int i, j, k;
        int a = 10, b = 20, d;
        // int c;

        // i = j = c; // invalid
        // int c = a = j; // invalid
        // int c = f = 10; // invalid
        // int c = 10 = a = 20; // invalid

        i = j = 10; // valid
        i = j = a; // valid
        i = j = i; // valid
        i = j = global; // valids
        d = a = b;
        int c = d = a; // invalid

    }
}

/*-

= can be chained. For example, assuming all the variables are declared appropriately before hand, a = b = c = d; is valid. However, chaining to use a value of a variable at the time of declaration is not allowed. For example, int a = b = c = 100; is invalid if b and c are not already declared. Had b and c been already declared, int a = b = c = 100; would have been valid.

*/