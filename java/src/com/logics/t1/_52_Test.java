package com.logics.t1;

class Pendrive {
    int capacity;

    Pendrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends Pendrive {
    String type;
    String make;

    OTG(int capacity, String type) {
        /*- INSERT HERE */
        super(capacity);
        this.type = type;
    }

    OTG(String make) {
        /*- INSERT HERE */
        super(0);
        this.make = make;
    }
}

public class _52_Test {

    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + " : " + obj.type);
    }

}

/*-

Expected Output: 128 : TYPE-C

Explanation
Java compiler adds super(); as the first statement inside constructor, if call to another constructor using this(...) or super(...) is not available. 

Compiler adds super(); as the first line in OTG's constructor: OTG(int capacity, String type) { super(); } but PenDrive class doesn't have a no-arg constructor and that is why OTG's constructor causes compilation error.

For the same reason, OTG(String make) constructor also causes compilation error.

To correct these compilation errors, parent class constructor should be invoked by using super(int); This would resolve compilation error.

Remember: Constructor call using this(...) or super(...) must be the first statement inside the constructor.



In the main(String[]) method, OTG(int, String) constructor is invoked, which means, we OTG(String) constructor will not be executed. So, to solve the complilation error in OTG(String) constructor, super(0); or super(128); both will work and these will not affect the expected output.



We have to make changes in OTG(int, String) constructor such that on execution, output is 128:TYPE-C.

super(capacity); will only assign value to capacity property, to assign value to type another statement is needed.

this.type = type; must be the 2nd statement.

So, /*INSERT-1 must be replaced with:

super(capacity);

this.type = type;

*/
