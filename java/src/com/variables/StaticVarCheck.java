package com.variables;
/*
 * created @ Wed May 19 2021 6:57:09 am
 * ref @ 
 * 
 * Static variables can be accssed in non-static methods
 * Non-Static variables cannot be accessed in static methods
 */

public class StaticVarCheck {
    static String var_1 = "avengers";
    String var_2 = "assemble !!";

    public static void main(String[] args) {

        /*- Cannot make a static reference to the non-static method func_2() from the type StaticVarCheckJava(603979977) */
        // below gives above error
        // func_2();

        StaticVarCheck obj = new StaticVarCheck();
        obj.func_2();
        obj.func_1();
        // above gives below warning:
        /*- The static method func_1() from the type StaticVarCheck should be accessed in a static wayJava(603979893) */
    }

    public static void func_1() {
        // System.out.printf("{} {}".format(var_1, var_2));
        // using var_2 gives below error:
        // Cannot make a static reference to the non-static field var_2Java(33554506)
    }

    public void func_2() {
        System.out.println(var_1 + " " + var_2);
    }
}
