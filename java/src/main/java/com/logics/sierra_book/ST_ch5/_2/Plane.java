package com.logics.sierra_book.ST_ch5._2;
/*
 * created @ Wed May 19 2021 6:54:10 am
 * ref @ 
 * 
 * Static variables can be accssed in non-static methods
 * Non-Static variables cannot be accessed in static methods
 */

public class Plane {
    static String s = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);
    }

    void s1() {
        try {
            s2();
        } catch (Exception e) {
            s += "c";
        }
    }

    void s2() throws Exception {
        s3();
        s += "2";
        s3();
        s += "2b";
    }

    void s3() throws Exception {
        throw new Exception();
    }
}
