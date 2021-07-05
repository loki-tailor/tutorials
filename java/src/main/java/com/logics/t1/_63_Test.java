package com.logics.t1;

class X {
    void greet() {
        System.out.println("Good Morning !");
    }
}

class Y extends X {
    void greet() {
        System.out.println("Good Afternoon");
    }
}

class Z extends Y {
    void greet() {
        System.out.println("Good Night");
    }
}

public class _63_Test {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        X x3 = new Z();
        x1.greet();
        x2.greet();
        x3.greet();

        Y y1 = (Y) x3;
        y1.greet();
        ((Y) x3).greet();
    }
}

/*-

Variable x1 refers to an instance of X. Hence x1.greet(); prints Good Morning! [Method of X is invoked]

Variable x2 refers to an instance of Y. Hence x2.greet(); prints Good Afternoon! [Method of Y is invoked]

Variable x3 refers to an instance of Z. Hence x3.greet(); prints Good Night! [Method of Z is invoked]



Statement `Y y2 = (Y)x3;` makes variable y2 to refer to the instance referred by x3, which is the instance of class Z. Hence, y2.greet(); prints Good Night! [Method of Z is invoked]



Statement `((Y)x3).greet();` is same as previous 2 statements. As variable x3 refers to an instance of class Z, therefore this statement also prints Good Night! [Method of Z is invoked]

*/
