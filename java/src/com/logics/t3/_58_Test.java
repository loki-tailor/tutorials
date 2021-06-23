package com.logics.t3;

class Parent2 {
    public String toString() {
        return "Inner ";
    }
}

class Child2 extends Parent2 {
    public String toString() {
        // return super.toString().concat("Peace!");
        System.out.println("hi");
        return super.toString().concat("Peace!");
    }
}

public class _58_Test {
    public static void main(String[] args) {
        System.out.println(new Child2());
    }
}
