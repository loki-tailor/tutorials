package com.logics.t1;

public class _49_Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + " : " + sb.toString().length());
    }
}

/*-

Explanation
`new StringBuilder(100);` creates a StringBuilder instance, whose internal char array's length is 100 but length() method of StringBuilder object returns the number of characters stored in the internal array and in this case it is 0. So, `sb.length()` returns 0.

sb.toString() is the String representation of StringBuilder instance and in this case as there are no characters inside the StringBuilder object, hence sb.toString() returns an empty String "", so `sb.toString().length()` also returns 0.

Output is 0:0.

*/