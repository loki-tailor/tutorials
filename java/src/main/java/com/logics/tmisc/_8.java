package com.logics.tmisc;

/*
 * created @ Fri Aug 06 2021 10:35:47 am
 * 
 */

public class _8 {
    public static void main(String[] args) {
        String word = "REBUS";

        System.out.println(word.substring(2));
        System.out.println(word.substring(2, 4));
        System.out.println(word.substring(2, 5));
        System.out.println(word.replace("RE", ""));
        // System.out.println(word.substring(2, 6)); // run-time-error
        System.out.println(word.delete(0, 2));
    }
}
