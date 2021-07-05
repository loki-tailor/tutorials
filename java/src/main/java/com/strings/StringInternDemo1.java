package com.strings;

/*
 * created @ Sat May 15 2021 12:24:41 pm
 * 
 * ref @ https://www.java67.com/2014/08/difference-between-string-literal-and-new-String-object-Java.html
 */

 /*-

 @ref: comments @   https://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-beginners-programming.html
 2) JVM does not intern all strings created by Java code, 
 only String literals are interned. String created using new() is not 
 interned until you explicitly call intern method on them.

 */
class Other {
    static String hello = "Hello";
}

public class StringInternDemo1 {

    public static void main(String[] args) {
        three(args);
    }

    public static void seven(String[] args) {

        // ref @ https://stackoverflow.com/a/43423384/7415499

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == c);

        /*-
            bytecode:

            * "javap -v <className>" to view detailed bytecode including the Constant Pool
            * below came from vscode plugin to view bytecode
        
            public static void main(java.lang.String[]);
                Code:
                0: ldc           #7                  // String abc
                2: astore_1
                3: ldc           #7                  // String abc
                5: astore_2
                6: new           #9                  // class java/lang/String
                9: dup
                10: ldc           #7                  // String abc
                12: invokespecial #11                 // Method java/lang/String."<init>":(Ljava/lang/String;)V
                15: astore_3
                16: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
                19: aload_1
                20: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
                23: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
                26: aload_2
                27: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
                30: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
                33: aload_1
                34: aload_3
                35: if_acmpne     42
                38: iconst_1
                39: goto          43
                42: iconst_0
                43: invokevirtual #25                 // Method java/io/PrintStream.println:(Z)V
                46: return
        */

    }

    public static void six(String[] args) {
        // ref @ https://stackoverflow.com/a/43423384/7415499

        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        // System.out.print((other.Other.hello == hello) + " "); // true
        System.out.print((hello == ("Hel" + "lo")) + " ");
        System.out.print((hello == ("Hel" + lo)) + " "); // false
        System.out.println(hello == ("Hel" + lo).intern());

        System.out.println(("a" + "b" + "c").intern() == "abc"); // true
        System.out.println(("a" + "b" + "c") == "abc"); // true
    }

    public static void five(String[] args) {
        // ref @ https://stackoverflow.com/q/3052442/7415499

        String s1 = "text";
        String s2 = new String("text");
        String s3 = "text";
        String s4 = s1;
        String s5 = "loki";

        System.out.println(s1.hashCode()); // 3556653
        System.out.println(s2.hashCode()); // 3556653
        System.out.println(s1 == s2); // false

        s2 = s2.intern();
        System.out.println(s1.hashCode()); // 3556653
        System.out.println(s2.hashCode()); // 3556653
        System.out.println(s1 == s2); // true
    }

    public static void four(String[] args) {
        // ref @ https://stackoverflow.com/q/3052442/7415499
        String a = "Java";
        String b = "Java";
        System.out.println(a == b); // true
        System.out.println("a==b?" + a == b); // false
        // i don't understand when i added some comment ("a==b ?) => my result becomes
        // FALSE. why?
    }

    public static void three(String[] args) {

        /*-
            * ref @ https://javarevisited.blogspot.com/2015/12/when-to-use-intern-method-of-string-in-java.html
        
            If I removed Line-2 and compare s1==s2, 
            it will return true. Could anyone explain me what exactly happens in string pool after Line-2?
        
        */
        String s1 = "Hello".concat("World");
        String s3 = new String("Hello World"); // Line-2
        String s2 = s1.intern();
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // false
    }

    public static void two(String[] args) {

        /*-
            Explain Mr. Javin Paul,
            1. Why 3rd will be true and why not 1/2?
            2. Afetr concatenation will new object will be created in heap/pool?
        */
        String a = "one";
        String b = "two";
        String c = a + b;
        String d = "one" + "two";
        String e = "onetwo";
        if (c == d) {
            System.out.println("c == d " + true);// 1st
        } else if (c == e) {
            System.out.println("c == e " + true);// 2nd
        } else if (d == e) {
            System.out.println("d == e " + true);// 3rd
        } else {
            System.out.println("default " + true);// 4th
        }
    }

    public static void one(String[] args) {
        System.out.println("testing intern");

        String a = new String("loki");
        String b = new String("loki");

        System.out.println("a == b @ " + (a == b));
        System.out.println("a.equals(b) @ " + a.equals(b));

        a = a.intern();
        b = b.intern();

        System.out.println();
        System.out.println("a == b @ " + (a == b));
        System.out.println("a.equals(b) @ " + a.equals(b));

    }
}