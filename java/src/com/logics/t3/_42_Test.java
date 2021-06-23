package com.logics.t3;

public class _42_Test {
    public static void main(String[] args) {

        final String fname = "Lokeshwar";
        String lname = "Tailor";
        String pname = "loki";

        String n1 = fname + lname;
        String n2 = fname + "Tailor";
        String n3 = "Lokeshwar" + lname;
        String n4 = "Lokeshwar" + "Tailor";

        String n5 = fname + pname;
        String n6 = pname + lname;
        String n7 = "Lokeshwar" + pname;
        String n8 = pname + "Tailor";

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("n6 = " + n6);
        System.out.println("n7 = " + n7);
        System.out.println("n8 = " + n8);

        System.out.println();

        System.out.println(n1 == n2); // false
        System.out.println(n2 == n3); // false
        System.out.println(n2 == n4); // true
        System.out.println(n3 == n4); // false
        System.out.println(n1 == n4); // false
        System.out.println(n1 == n3); // false

        System.out.println();

        System.out.println(n5 == n6); // false
        System.out.println(n5 == n7); // false
        System.out.println(n5 == n8); // false
        System.out.println(n6 == n7); // false
        System.out.println(n6 == n8); // false
        System.out.println(n7 == n8); // false

    }
}
