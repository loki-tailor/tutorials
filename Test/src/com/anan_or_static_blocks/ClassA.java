package com.anan_or_static_blocks;

public class ClassA {

    {
	System.out.println("Inside anon block");
    }

    static {
	System.out.println("Inside Static block");
    }

    public ClassA() {
	System.out.println("Inside Constructor");
    }

    public static ClassA getInstance() {
	System.out.println("Inside getInstance()");
	return new ClassA();
    }
}
