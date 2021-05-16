package com.logics.sierra_book.ST_ch6._05;

/*- @created = 14-05-21 */

public class Sequence {
    public static void main(String[] args) {
        java.util.ArrayList<String> myList = new java.util.ArrayList<String>();
        myList.add("apple");
        myList.add("carrot");
        myList.add("banana");
        myList.add(1, "plum");
        System.out.println(myList);
    }
}

/*-
output: [apple, plum, carrot, banana]
*/