package com.logics.t1._31.test;

import com.logics.t1._31.A;
import com.logics.t1._31.B;
import com.logics.t1._31.F;
import com.logics.t1._31.G;

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = (B) obj1;
        obj2.print();

        D obj_d = new D();
        E obj_e = (E) obj_d;

        F obj_f = new F();
        G obj_g = (G) obj_f;

    }
}

class D {}

class E extends D {}

/*-

*/
