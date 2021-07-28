package com.logics.t12._66;
/*
 * created @ Tue Jul 27 2021 6:50:47 am
 * ref @ 
 */

interface Movable {
    void move(); // is implicitly public abstract
}

abstract class Animal {
    void move() {
        System.out.println("ANIMAL MOVING");
    }
}


// if 'move()' is 'public' in 'Animal', then below will not give compile error
class Dog extends Animal implements Movable {
}
/*-
above will give compile error:

The inherited method Animal.move() cannot hide the public abstract method in Movable

Reason: interface has declared the method as public static & Dog is trying to provide a 'default' access to move() [which is originally coming from super class Animal]
*/

public class Test {

}
