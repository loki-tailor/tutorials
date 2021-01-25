package com.strings;

/*-
    @created 25-01-20

    String a = "a";
    * In above only 1 object is created in SCP and variable 'a' is the reference to it
    
    String a = new String("loki");
    * In above, 2 objects are created, 
        : the variable 'a' - in heap
        : the object in heap memory where 'a' is pointing as "loki"
        : the object in SCP where JVM implicit variable is pointing "loki"
        : the SCP object does not get garbage collected, because internal reference will be maintained by JVM itself

    Until Java 1.6  : SCP is a part of Method-Area / PERMGEN (permenant-generation)       
                    : SCP was always of fixed size

    From Java 1.7   : SCP is moved to moved to heap only (for effectient memory utilization)
                    : SCP can expand since it resides in heap memory

    *   Strings created without using the new keyword are NEVER garbage collected. 
        Even if there are no references to them. 
        All such strings go into the String pool and just sit there till the whole program ends (ie. the JVM)                                
*/

public class StrCompareHcodeGC {
    public static void main(String[] args) {
        System.out.println("\n\"a\" == \"a\" @ " + ("a" == "a"));

        // compile error: incompatible types
        // System.out.println("\n\"a\" == 97" + ("a" == 97));

        System.out.println("\n'a' == 97 @ " + ('a' == 97)); // true

        System.out.println("\n\"a\" == 97 @ " + ("a" == "97"));

        String a1 = "a";
        String a2 = "a";
        System.out.println(
            "\na1 = " + a1 + " @ hashCode = " + a1.hashCode() 
            + ",\na2 = " + a2 + " @ hashCode = " + a2.hashCode()
            + ",\na1 == a2 @ " 
            + (a1 == a2)
            + "\n"
        );

        String a3 = new String("a");
        String a4 = new String("a");
        System.out.println(
            "a3 = new String(\"a\") @ hashCode = " + a3.hashCode()
            + ",\na4 = new String(\"a\") @ hashCode = " + a4.hashCode()
            + "\n(a3 == a4) @ " 
            + (a3 == a4)   
            + "\n"
        );

        StringBuffer a5 = new StringBuffer("a");
        StringBuffer a6 = new StringBuffer("a");
        System.out.println(
            "a5 = new StringBuffer(\"a\") @ hashCode = " + a5.hashCode()
            + ",\na6 = new StringBuffer(\"a\") @ hashCode = " + a6.hashCode()
            + "\n(a5 == a6) @ "
            + (a5 == a6)
            + "\n"
        );

    }
}

/*-
    OUTPUT:

    "a" == "a" @ true

    'a' == 97 @ true

    "a" == 97 @ false

    a1 = a @ hashCode = 97,
    a2 = a @ hashCode = 97,
    a1 == a2 @ true

    a3 = new String("a") @ hashCode = 97,
    a4 = new String("a") @ hashCode = 97
    (a3 == a4) @ false

    a5 = new StringBuffer("a") @ hashCode = 366712642,
    a6 = new StringBuffer("a") @ hashCode = 1829164700
    (a5 == a6) @ false

*/