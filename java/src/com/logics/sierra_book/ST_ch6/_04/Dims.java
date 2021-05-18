package com.logics.sierra_book.ST_ch6._04;

/*-
    @created 14-05-21


*/

public class Dims {
    public static void main(String[] args) {
        int[][] a = { {1,2}, {3,4} };
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        int[] b2 = (int[]) o1; // runtime exception, not COMPILE-TIME
        System.out.println(b[1]);
    }
}

/*-

OUTPUT:

Exception in thread "main" java.lang.ClassCastException: [[I cannot be cast to [I
        at com.logics.sierra_book.ST_ch6._04.Dims.main(Dims.java:15)

*/