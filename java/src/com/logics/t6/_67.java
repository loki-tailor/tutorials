package com.logics.t6;

public class _67 {
    public static void main(String[] args) {
        getInt(2.5);

        getInt(2); // compile error: The method getInt(Double) in the type _68 is not applicable
                   // for the arguments (int)Java(67108979)
        // above will not give compile error if overloaded method as getInt(double) is
        // present

    }

    private static void getInt(Double obj) {
        System.out.println("Double Version: " + obj.intValue());
    }

    private static double getInt(double d) {
        System.out.println(d);
        return d + 100;
    }
}

/*-

compiler can either do casting (int -> double) or auto-boxing (double -> Double) but not both at same time

extractInt method accepts argument of Double type.



extractInt(2.7); => 2.7 is double literal, so Java compiler would box it into Double type. At runtime obj.intValue() would print int portion of the Double data, which is 2.



extractInt(2); => Java compiler either does implicit casting or Wrapping but not both. 2 is int literal, Java compiler can't implicit cast it to double and then box it to Double. So this statement causes compilation failure.

*/