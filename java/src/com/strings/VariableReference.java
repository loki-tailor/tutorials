package com.strings;

/*- @created 05-01-2021 
OCAJP8 Sierra Book: Page 341

@18-01-21
    : modified as per understanding and readable output

*/

public class VariableReference {
    public static void main(String[] args) {
        String s = "abcde";
        String s2 = s;

        // s & s2 having similar hashCode
        display(s,"s"); display(s2,"s2"); System.out.println();

        // only s hashCode will change, s2 hashcode will remain same
        s = s.concat(" more stuff");
        System.out.println("After, 's = s.concat(' more stuff')'");
        display(s,"s"); display(s2,"s2"); System.out.println();

        // hashCode similar to starting is re-assigned
        s = "abcde";
        String s3 = "abcde";
        System.out.println("After, s=\"abcde\" & String s3 = \"abcde\"");
        display(s,"s");
        display(s2,"s2");
        display(s3,"s3");
        System.out.println();

        // even after 'new' keyword, s4 has same hashCode
        String s4 = new String("abcde");
        System.out.println("After, String s4 = new String(\"abcde\")");
        display(s,"s"); display(s2,"s2"); display(s3,"s3"); display(s4,"s4");  System.out.println();

        // technically 2 objects are created here
        // one in pool & one in heap
        String s5 = new String("ab");
        System.out.println("After, String s5 = new String('ab')");
        display(s,"s"); display(s2,"s2"); display(s3,"s3"); display(s4,"s4"); display(s5,"s5");  System.out.println();

        String s6 = "ab";
        System.out.println("After, String s6 = 'ab'");
        display(s,"s"); display(s2,"s2"); display(s3,"s3"); display(s4,"s4"); display(s5,"s5"); display(s6, "s6"); System.out.println();

    }

    static void display(String value, String varName) {
        System.out.println("variable = " + varName + ", varValue = " + value + ", hashCode = " + value.hashCode());
    }    
}
/*-
    OUTPUT:

    variable = s, varValue = abcde, hashCode = 92599395
    variable = s2, varValue = abcde, hashCode = 92599395

    After, 's = s.concat(' more stuff')'
    variable = s, varValue = abcde more stuff, hashCode = -1290362554
    variable = s2, varValue = abcde, hashCode = 92599395

    After, s="abcde" & String s3 = "abcde"
    variable = s, varValue = abcde, hashCode = 92599395
    variable = s2, varValue = abcde, hashCode = 92599395
    variable = s3, varValue = abcde, hashCode = 92599395

    After, String s4 = new String("abcde")
    variable = s, varValue = abcde, hashCode = 92599395
    variable = s2, varValue = abcde, hashCode = 92599395
    variable = s3, varValue = abcde, hashCode = 92599395
    variable = s4, varValue = abcde, hashCode = 92599395

    After, String s5 = new String('ab')
    variable = s, varValue = abcde, hashCode = 92599395
    variable = s2, varValue = abcde, hashCode = 92599395
    variable = s3, varValue = abcde, hashCode = 92599395
    variable = s4, varValue = abcde, hashCode = 92599395
    variable = s5, varValue = ab, hashCode = 3105

    After, String s6 = 'ab'
    variable = s, varValue = abcde, hashCode = 92599395
    variable = s2, varValue = abcde, hashCode = 92599395
    variable = s3, varValue = abcde, hashCode = 92599395
    variable = s4, varValue = abcde, hashCode = 92599395
    variable = s5, varValue = ab, hashCode = 3105
    variable = s6, varValue = ab, hashCode = 3105

*/