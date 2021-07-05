package com.logics.t3;

public class _19_Test {

    // 1
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    // 2
    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10, new Integer(10)); // mapped to 1

        add(10.0, 10); // mapped to 1

        // add(Double.valueOf(10), 10.0); // compile error : method is ambiguous

        add(Double.valueOf(10), Double.valueOf(10)); // Double Versioon

        add(Double.parseDouble("10"), Double.parseDouble("10")); // 'double' version

        add(Double.parseDouble("10"), 10.0); // mapped to 1

        // add(Double.parseDouble("10"), Double.valueOf(10)); // compile error : method
        // is ambiguous

        // add(10.0, new Double(10.00)); // compile error

        add(10.0, null); // Double Version
        add(null, 10.0); // Double Version
        /*- explanation for above:
        Explanation
        add(10.0, null); => Compiler can't convert null to double primitive type, so 2nd argument is tagged to Double reference type.
        
        So to match the method call, 10.0 is converted to Double object by auto-boxing and add(10.0, null); is tagged to add(Double, Double); method.
        
        
        
        But at the time of execution, d2 is null so System.out.println("Double version: " + (d1 + d2)); throws NullPointerException.*/

    }
}
