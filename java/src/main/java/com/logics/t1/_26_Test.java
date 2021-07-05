package com.logics.t1;

class Pen {

}

public class _26_Test {
    public static void main(String[] args) {
        new Pen(); // Line 1
        Pen p = new Pen(); // Line 2
        System.out.println(p);
        change(p); // Line 3
        System.out.println(p);
        System.out.println("About to end."); // Line 4
    }

    public static void change(Pen pen) { // Line 5
        pen = new Pen(); // Line 6
        System.out.println(pen);
    }
}

/*-

How many objects of Pen class are eligible for Garbage Collection at Line 4?

Explanation
Object created at Line 1 becomes eligible for Garbage collection after Line 1 only, as there are no references to it. So We have one object marked for GC. 

Object created at Line 6 becomes unreachable after change(Pen) method pops out of the STACK, and this happens after Line 3.

So at Line 4, we have two Pen objects eligible for Garbage collection: Created at Line 1 and Created at Line 6.

*/
