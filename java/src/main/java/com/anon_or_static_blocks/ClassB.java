package com.anon_or_static_blocks;

public class ClassB {

    public static void main(String[] args) {
        ClassA classA = ClassA.getInstance();
        System.out.println(classA);
    }

}
