package com.logics.t1._68;

public class C extends A {

    public void print() {
        A obj_a = new A();

        System.out.println(obj_a.i1);
        System.out.println(obj_a.i2); // i2 is accessible in same package

        System.out.println(this.i1);
        System.out.println(this.i2);

        System.out.println(super.i1);
        System.out.println(super.i2);
    }

}
