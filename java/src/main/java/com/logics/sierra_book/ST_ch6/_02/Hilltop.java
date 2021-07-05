package com.logics.sierra_book.ST_ch6._02;

/*-

    @created 14-05-21

    Q - What is the result:
    $ java Hilltop eyra vafi draumr kara

*/

public class Hilltop {
    public static void main (String[] args) {
        String[] horses = new String[5];
        System.out.println(java.util.Arrays.toString(horses));
        horses[4] = null; // me: can be NPE, since horses[4] is by default null
        System.out.println(java.util.Arrays.toString(horses));
        for(int i = 0; i < horses.length; i++) {
            if (i < args.length)
                horses[i] = args[i];
            System.out.print(horses[i].toUpperCase() + " "); // me: NPE when toUpperCase for hourses[4]
        }
        
    }
}

/*-

OUTPUT:

[null, null, null, null, null]
[null, null, null, null, null]
EYRA VAFI DRAUMR KARA Exception in thread "main" java.lang.NullPointerException
        at com.logics.sierra_book.ST_ch6._02.Hilltop.main(Hilltop.java:21)

*/