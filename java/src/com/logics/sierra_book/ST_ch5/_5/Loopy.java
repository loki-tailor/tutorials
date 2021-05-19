package com.logics.sierra_book.ST_ch5._5;
/*
 * created @ Wed May 19 2021 7:15:01 am
 * ref @ 
 */

public class Loopy {
    public static void main(String[] args) {
        int[] x = { 7, 6, 5, 4, 3, 2, 1 };

        // different ways to iterate loop

        // 1.
        // for(int y : x) {

        // 2. compile error, something like syntax error
        // for(x : int y) {

        // 3.
        // int y = 0;
        /*- for(y : x) { // error @ Type mismatch: cannot convert from element type int to yJava(16777796) */

        // 4.
        /*-
        for (int y = 0, z = 0; z < x.length; z++) {
            y = x[z];
        */

        // 5. error @ Syntax error on token "int", delete this tokenJava(1610612968)
        /*-
         for(int y =0, int z = 0; z<x.length; z++) {
            y = x[z];
        */

        // 6.
        int y = 0;
        for (int z = 0; z < x.length; z++) {
            y = x[z];
            System.out.print(y + " ");
        }
    }
}
