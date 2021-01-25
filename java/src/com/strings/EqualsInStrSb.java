package com.strings;

/*-
    @created 18-01-21

    String.equals() : used for comparings of the content of the string, becuase equals() is overidden

    StringBuilder.equals() : used for comparison of references, because equals() is not overidden

    String[].equals() : used for comparison of references, because equals() is not overidden

    Ref: https://youtu.be/P5tFJ9umhvk?t=134
*/

public class EqualsInStrSb {

    public static void main(String[] args) {

        String s1 = "loki";
        String s2 = "loki";

        StringBuilder sb1 = new StringBuilder("loki2");
        StringBuilder sb2 = new StringBuilder("loki2");

        String[] sa1 = {"loki3"};
        String[] sa2 = {"loki3"};

        System.out.println("'String' : s1.equals(s2) : " + s1.equals(s2));
        System.out.println("'StringBuilder' : sb1.equals(sb2) : " + sb1.equals(sb2));
        System.out.println("'String[]' : sa1.equals(sa2) : " + sa1.equals(sa2));
    }
}

/*-
    OUTPUT:

    'String' : s1.equals(s2) : true
    'StringBuilder' : sb1.equals(sb2) : false
    'String[]' : sa1.equals(sa2) : false
*/