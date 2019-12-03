package com.logics.tu;

public class C1 implements I1, I2 {

    public static void main(String[] args) {
	new C1().show();

    }

    @Override
    public void show() {
	System.out.println("hey");

    }

}
