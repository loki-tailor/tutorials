package com.logics.t3;

class Parent {
    int i = 10;

    Parent(int i) {
        super();
        this.i = i;
    }
}

class Child extends Parent {
    int j = 20;

    Child(int j) {
        super(0);
        this.j = j;
    }

    Child(int i, int j) {
        super(i);
        this(j); // constructor call must be the 1st statement
        // can't have both this() and super() bro...
    }

}

public class _30_Test {
    public static void main(String[] args) {
        Child child = new Child(1000, 2000);
        System.out.println(child.i + ":" + child.j);
    }
}

/*-
Explanation
super(); inside Parent(int) constructor invokes the no-arg constructor of Object class and hence no compilation error for Parent(int) constructor. 



super(0); inside Child(int) constructor invokes Parent(int) constructor, which is available and hence no issues. 



Child(int, int) constructor has both super(i) and this(j) statements. A constructor should have super(...) or this(...) but not both. Hence Child(int, int) causes compilation failure.



As all the classes are defined in Test.java file under com.udayan.oca.test package, hence child.i and child.j don't give compilation error. i and j are declared with package scope.
*/
