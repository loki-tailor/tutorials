package com.strings;

/*
 * created @ Mon May 17 2021 7:59:43 am
 * ref @ comments @ https://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-beginners-programming.html
 * 
 * 1) While calling equals() method with String literal, 
 * prefer defensive approach e.g. calling equals() on String literal rather than on String object e.g.

 "USA".equals(country) will return false if country is null. 
 While country.equals("USA") will throw NullPointerException, if country is null.

 */

public class EqualsMethodDefensiveApproach {
    public static void main(String[] args) {

        // String name = "loki";
        String name = null;

        System.out.println("loki".equals(name)); // false
        System.out.println(name.equals("loki")); // NPE

    }
}
