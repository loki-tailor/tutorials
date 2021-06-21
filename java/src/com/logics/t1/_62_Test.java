package com.logics.t1;

public class _62_Test {
    public static void main(String[] args) {
        Integer i1 = 127; // Integer object created through auto-boxing and value is between -128 to 127,
                          // hence referred by Integer pool.
        Integer i2 = 127; // Integer object with value 127 is already available in Integer pool and hence
                          // i2 referred to same object.
        System.out.println(i1 == i2); // Prints true

        Integer i3 = new Integer(127); // new keyword always creates a new object
        Integer i4 = new Integer(127); // new keyword always creates a new object
        System.out.println(i3 == i4); // Prints false

        Integer i5 = 200; // Integer object created through auto-boxing and value is NOT between -128 to
                          // 127, hence NOT referred by Integer pool.
        Integer i6 = 200; // Integer object created through auto-boxing and value is NOT between -128 to
                          // 127, hence NOT referred by Integer pool.
        System.out.println(i5 == i6); // Prints false
    }
}

/*-

Dear Mangala,

1st add statement `list.add(110);`, creates an integer object and as value is between -128 to 127, hence this object is referred by Integer Pool.

2nd add statement `list.add(new Integer(110));` creates another integer object but as ‘new’ keyword is used, hence this object is not referred by Integer Pool.

3rd add statement `list.add(110);`, As value is between -128 to 127, hence this statement doesn’t create a new Integer object, rather it refers to the same Integer object created at 1st add statement.



Just remember this:

Two instances of following wrapper objects, created through auto-boxing will always be same, if their primitive values are same:

Boolean,

Byte,

Character from \u0000 to \u007f (7f equals to 127),

Short and Integer from -128 to 127.
@ref : https://www.udemy.com/course/java-oca/learn/quiz/4358470#questions/13958240

*/
