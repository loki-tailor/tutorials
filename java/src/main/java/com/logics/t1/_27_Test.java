package com.logics.t1;

public class _27_Test {
    /*-
    
        /*INSERT {
        System.out.println("Hurrah! I passed...");
    
    */

    /*- static public void main(String[] args) {     System.out.println("Hurrah! I passed...");   } */
    /*- public static void main(String[] args) {     System.out.println("Hurrah! I passed...");   } */

    // below is invalid
    /*- public void static main(String[] args) {     System.out.println("Hurrah! I passed...");   } */
    // return type should be before the method name only

}

/*-

Explanation
As System.out.println needs to be executed on executing the Test class, this means special main method should replace /*INSERT.

Special main method's name should be "main" (all characters in lower case), should be static, should have public access specifier and it accepts argument of String [] type. String [] argument can use any identifier name, even though in most of the cases you will see "args" is used.

Position of static and public can be changed but return type must come just before the method name.

*/