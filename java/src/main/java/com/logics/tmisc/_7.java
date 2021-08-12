package com.logics.tmisc;

/*
 * created @ Fri Aug 06 2021 8:51:15 am
 * ref @ udemy @ Test #5
 * ref @ https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/
 */

class M {
    public  void main(String[] args) {
        System.out.println("M");
    }
}

class N extends M {
    public static void main(String[] args) { // error: This static method cannot hide the instance method from M
        new M().main(args);
    }
}

public class _7 {
    public static void main(String[] args) {
        N.main(args);
    }    
}
