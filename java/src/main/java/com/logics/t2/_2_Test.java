package com.logics.t2;

public class _2_Test {
    public static void main(String[] args) throws NegativeArraySizeException {
        int[] a = new int[-1];
    }
}

/*-

output:

Exception in thread "main" java.lang.NegativeArraySizeException
        at com.logics.t2._2_Test.main(_2_Test.java:5)
*/
