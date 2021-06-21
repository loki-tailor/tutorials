package com.logics.t1;
/*
 * created @ Sun Jun 20 2021 10:09:19 pm
 * ref @ https://self-learning-java-tutorial.blogspot.com/2017/06/can-i-pass-null-to-append-method-of.html 
 */

public class _51_Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(null).length());
    }
}

/*-

Explanation
'append' method is overloaded in StringBuilder class: append(String), append(StringBuffer) and append(char[]) etc.

In this case compiler gets confused as to which method `append(null)` can be tagged because String, StringBuffer and char[] are not related to each other in multilevel inheritance. Hence `sb.append(null)` causes compilation error.

*/