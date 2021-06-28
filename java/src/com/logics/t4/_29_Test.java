package com.logics.t4;

import java.util.ArrayList;
import java.util.List;

public class _29_Test {

    public static void main(String[] args) {
        one(100);
        one(200);
        two(100);
        two(200);
        three(100);
        three(100);

    }

    public static void one(Integer num) {
        List<Integer> list = new ArrayList<>();

        list.add(num);

        list.add(new Integer(num));

        list.add(num);

        list.removeIf(i -> i == num);

        System.out.println(list);

    }

    public static void two(int num) {
        List<Integer> list = new ArrayList<>();

        list.add(num);

        list.add(new Integer(num));

        list.add(num);

        list.removeIf(i -> i == num);

        System.out.println(list);

    }

    public static void three(int num) {
        List<Integer> list = new ArrayList<>();

        list.add(num);

        list.add(new Integer(num));

        list.add(num);

        list.removeIf(i -> i == new Integer(num));

        System.out.println(list);

    }

}

/*-

Explanation
As list can store only wrapper objects and not primitives, hence 

for list.add(110); auto-boxing creates an Integer object {110}. 

for list.add(new Integer(110)); as new keyword is used so another Integer object {110} is created. 

for 3rd add method call, list.add(110); auto-boxing kicks in and as 110 is between -128 to 127, hence Integer object created at 1st statement is referred.



removeIf(Predicate) method was added as a default method in Collection interface in JDK 8 and it removes all the elements of this collection that satisfy the given predicate. 



Boolean expression is : i == 110; in this expression i is wrapper object and 110 is int literal so java extracts int value of wrapper object, i and then equates. As all the 3 objects store 110, hence true is returned. All integer objects are removed form the list.



If list.removeIf(i -> i == new Integer(110)); was used, then all three list elements would return false as object references are equated and not contents.

*/