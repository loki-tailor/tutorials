package com.logics.t4;

class Super {
    public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() {
        System.out.println(200);
        // compile error: Implicit super constructor Super() is undefined. Must
        // explicitly invoke
        // another constructorJava(134217871)
    }
}

public class _1_Tst {

}

/*-

Explanation
super(); is added by the compiler as the first statement in both the constructors.

Class Super extends from Object class and Object class has no-argument constructor, hence no issues with the constructor of Super class.



But no-arg constructor is not available in Super class, hence calling super(); from Sub class constructor gives compilation error.

*/
