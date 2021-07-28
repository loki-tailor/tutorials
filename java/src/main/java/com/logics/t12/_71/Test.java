package com.logics.t12._71;
/*
 * created @ Mon Jul 26 2021 9:07:01 am
 * ref @ 
 */

interface Super {
    // private String s1 = "private"; // error

    // private String SUPER = "SUPER"; // error

    String SUPER = "SUPER";

}

interface Sub extends Super {

}

public class Test {
    public static void main(String[] args) {
        Sub sub = null;
        System.out.println(sub.SUPER); // warning only: The static field Super.SUPER should be accessed in a static way
    }

}
