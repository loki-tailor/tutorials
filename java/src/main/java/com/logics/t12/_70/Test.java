package com.logics.t12._70;
/*
 * created @ Mon Jul 26 2021 9:11:46 am
 * ref @ 
 */

abstract class Animal {
    abstract void jump() throws RuntimeException;
}

class Deer extends Animal {

    void jump() {
        System.out.println("DEER JUMPS");
    }

    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }

}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Deer();
        ((Deer) animal).jump();

        // Deer s = ((Deer) animal);
        // Animal a = new Animal(); // error cannot instantiate abstract class

        ((Deer) animal).jump(5);
    }
}
