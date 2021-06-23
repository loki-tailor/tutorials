package com.logics.t3;
/*
 * created @ Wed Jun 23 2021 6:31:14 am
 * ref @ 
 */

import java.util.ArrayList;
import java.util.List;

public class _28_Test {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 10;
        Integer c = new Integer(10);
        System.out.println("a == b = " + (a == b)); // true
        System.out.println("b == c = " + (b == c)); // false
        System.out.println("a == c = " + (a == c)); // true, why?
        System.out.println("c == a = " + (c == a)); // true, why?
        System.out.println();

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(new Integer(10));
        list.add(new Integer(10));

        System.out.println("list.get(0) == list.get(1) = " + (list.get(0) == list.get(1))); // true
        System.out.println("list.get(2) == list.get(3) = " + (list.get(2) == list.get(3))); // false, why?
        System.out.println("list.get(0) == list.get(2) = " + (list.get(0) == list.get(2))); // false, why?

        System.out.println();
        System.out.println(list.get(0).hashCode()); // prints '10' only...
        System.out.println(list.get(1).hashCode()); // prints '10' only...
        System.out.println(list.get(2).hashCode()); // prints '10' only...
        System.out.println(list.get(3).hashCode()); // prints '10' only...

        System.out.println();
        list.clear();
        list.add(127);
        list.add(127);
        list.add(new Integer(127));
        list.add(new Integer(127));
        System.out.println("list.get(0) == list.get(1) = " + (list.get(0) == list.get(1))); // true
        System.out.println("list.get(2) == list.get(3) = " + (list.get(2) == list.get(3))); // false, why?
        System.out.println("list.get(0) == list.get(2) = " + (list.get(0) == list.get(2))); // false, why?

        System.out.println();
        list.clear();
        list.add(128);
        list.add(128);
        list.add(new Integer(128));
        list.add(new Integer(128));
        System.out.println("list.get(0) == list.get(1) = " + (list.get(0) == list.get(1))); // true
        System.out.println("list.get(2) == list.get(3) = " + (list.get(2) == list.get(3))); // false, why?
        System.out.println("list.get(0) == list.get(2) = " + (list.get(0) == list.get(2))); // false, why?
    }
}

/*-

Explanation
This is bit tricky. Just remember this:

Two instances of following wrapper objects, created through auto-boxing will always be same, if their primitive values are same:

Boolean,

Byte,

Character from \u0000 to \u007f (7f equals to 127),

Short and Integer from -128 to 127. 



For 1st statement, list.add(27); => Auto-boxing creates an integer object for 27. 

For 2nd statement, list.add(27); => Java compiler finds that there is already an Integer object in the memory with value 27, so it uses the same object.



That is why System.out.println(list.get(0) == list.get(1)); returns true. 



new Integer(27) creates a new Object in the memory, so System.out.println(list.get(2) == list.get(3)); returns false.

*/