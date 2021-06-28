package com.logics.sierra_book.ST_ch6._13;

/*- @created 17-05-21 */

import java.util.function.Predicate;

public class Sheep {
    
    public static void main(String[] args) {
        Sheep s = new Sheep();
        
        // s.go(() -> adder(5,1) < 7); // fail: predicate needs 1 arg, compile error = incompatible types: incompatible parameter types in lambda expression

        s.go(x -> adder (6,2) < 9); // pass

        // s.go(x, y -> adder(3,2) < 4); // fail: predicate only 1 arg, strangely compile error = cannot find symbol x

        System.out.printf("{}".format("done"));
    }

    void go(Predicate<Sheep> e) {
        Sheep s2 = new Sheep();
        if(e.test(s2))
            System.out.print("true ");
        else
            System.out.print("false ");
    }
    
    static int adder(int x, int y) {
        return x + y;
    }

}