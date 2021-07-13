package com.logics.t11._65;
/*
 * created @ Mon Jul 12 2021 7:02:00 am
 * ref @ 
 */

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");

        // System.out.println(sb.reverse().replace("A","B")); // error : The method
        // replace(int, int, String) in the type StringBuilder is not applicable for the
        // arguments (String, String)

        System.out.println(sb.reverse().replace(0, sb.length(), sb.toString().toLowerCase()));
    }
}
