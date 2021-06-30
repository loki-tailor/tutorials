package com.misc;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class J11New {

    public static void main(String[] args) {
        // optional_new();
        sep();
        predicate_new();
        sep();
    }

    /*--
        Predicate::not
    */
    private static void predicate_new() {
        Stream<String> s = Arrays.asList("1", "2", "").stream();
        s //
                .filter(Predicate.not(String::isBlank)) //
                .forEach(System.out::println);

    }

    private static void optional_new() {
        var opt = Optional.ofNullable(null);
        sep();
        System.out.println("opt = " + opt);
        sep();
        System.out.println("opt.isEmpty() == true @ " + (opt.isEmpty() == true));
    }

    private static void files_new() {

        /*-
            String readString(Path path);
            String readString(Path path, Charset cs);
        
            Path writeString(Path p, CharSequence c, OpenOption o);
            Path writeString(Path p, CharSequence c, Charset c, OpenOption o);
        */
    }

    public static void strings_new(String[] args) {

        // ################################################################################

        String a = "** ".repeat(10) + " loki";
        System.out.println("a = '** ''.repeat(10) + 'loki' = " + a);

        String b = "  ", c = "   l";
        System.out.println(a.isEmpty() + " : " + b.isEmpty() + " : " + c.isEmpty());
        System.out.println(a.trim().isEmpty() + " : " + b.trim().isEmpty() + " : " + c.trim().isEmpty());
        System.out.println(a.isBlank() + " : " + b.isBlank() + " : " + c.isBlank());

        // ################################################################################

        System.out.println("-".repeat(100));
        String d = "\n\r\t    text      \u2800.";
        System.out.println(d);
        System.out.println("-".repeat(100));
        System.out.println(d.trim());
        System.out.println("-".repeat(100));
        System.out.println(d.strip());

        // ################################################################################

        String f = "1\n2\n3\b4\n";
        System.out.println(f);
        sep();
        f.lines().forEach(System.out::println);

    }

    private static void sep() {
        System.out.println("-".repeat(100));
    }

}
