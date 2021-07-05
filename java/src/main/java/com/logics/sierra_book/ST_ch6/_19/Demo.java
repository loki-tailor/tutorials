package com.logics.sierra_book.ST_ch6._19;

/*- @created 17-05-21 */

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Predicate<String> e = (x) -> "loki".equals(x);

        if(e.test("loki"))
            System.out.println("if-contition passed");

        // switch(e.test("loki")) { // compile error: incompatible types: boolean cannot be converted to int
        //     case true: break;
        //     case false: break;
        // }    
        
        String str = "loki";
        while(e.test(str)) {
            System.out.println("while-condition passed");
            str = "lokeshwar";
        }            

        System.out.println("conditional test: " + (e.test("LOKI") ? "no" : "yes"));

        do {
            System.out.println("do-while test: passed");
        }while(e.test(str));

        boolean b = e.test("loki");
        System.out.println("boolean test = " + b);
        System.out.print("sysout test: " + (e.test("loki")));
    }
}