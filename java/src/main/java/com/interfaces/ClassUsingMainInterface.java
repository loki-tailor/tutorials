package com.interfaces;

public class ClassUsingMainInterface {

    public static void main(String[] args) {
        InterfaceWithMain.main(args);
        InterfaceWithMain d = new D2();
    }
}

class D2 implements InterfaceWithMain {

}
