package com.logics.t1._68.test;

import com.logics.t1._68.A;

public class B extends A {

    public void print() {
        A obj_a = new A();

        System.out.println(obj_a.i1);
        System.out.println(obj_a.i2);

        System.out.println(this.i1);
        System.out.println(this.i2);

        System.out.println(super.i1);
        System.out.println(super.i2);
    }
}

/*-

Explanation
class A is declared public and defined in com.udayan.oca package, there is no problem in accessing class A outside com.udayan.oca package.

class B is defined in com.udayan.oca.test package, to extend from class A either use import statement "import com.udayan.oca.A;" or fully qualified name of the class com.udayan.oca.A. No issues with this class definition as well.



Variable i1 is declared public in class A, so Line 8 doesn't cause any compilation error. Variable i2 is declared protected so it can only be accessed in subclass using inheritance but not using object reference variable. obj.i2 causes compilation failure.



class B inherits variable i2 from class A, so inside class B it can be accessed by using either this or super. Line 10 and Line 11 don't cause any compilation error.

*/
