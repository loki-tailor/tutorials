package com.logics.sierra_book.ST_ch6._01;

/*- @created 15-05-21
    Which 2 substring will be included in the result? (choose 2)
    v - .abc.
        x - .ABCd
        x - .ABCD.
    v - .cbad
        x - .dcba
*/

public class Mutant {
    public static void main(String... args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d");
        s.toUpperCase().concat("d");
        System.out.println("." + sb + ". ." + s + ".");
    }
}

/*- output: .cbad. .abc. */