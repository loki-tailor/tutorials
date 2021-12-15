package com.logics.tmisc.ET1_13;

import com.logics.tmisc.ET1_13.other.*;

public class Test {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";

        System.out.println((com.logics.tmisc.ET1_13.Other.hello == hello) + " ");
        System.out.println((com.logics.tmisc.ET1_13.other.Other.hello == hello) + " ");
        System.out.println((hello == ("Hel" + "lo")) + " ");
        System.out.println((hello == ("Hel" + lo)) + " "); // since lo is not a final var, this will give false
        System.out.println(hello == ("Hel" + lo).intern()); // intern() forces to look into the StringPool
    }
}

class Other {
    static String hello = "Hello";
}