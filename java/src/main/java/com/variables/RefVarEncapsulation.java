package com.variables;

/*-

    @created 14-05-21

    @ref: sierra book OCAJA8 - pg. 401

    ** ENCAPSULATION FOR REFERENCE VARIABLE **

    *   To encapsulate mutable objects like StringBuilders, or arrays or ArrayLists, you cannot return a reference to these objects;
        you must first make a copy of the object and return a reference to the copy.

    * Any class that has a method that returns a reference to a mutable object is breaking encapsulation

*/

class Special {
    private StringBuilder sb = new StringBuilder("Lokeshwar");

    StringBuilder getName() { return sb; }

    void printName() { System.out.println(sb); }
}

public class RefVarEncapsulation {
        public static void main(String... args) {
        Special s = new Special();
        StringBuilder sb2 = s.getName();

        // this violates encapsulation for ref vars, it changes value of sb, event though it was private
        // since returned value is a reference to the object
        // hence below was able to modify the contents
        sb2.append(" [new-text] Tailor"); 
        s.printName();
    }
}

// output: Lokeshwar [new-text] Tailor