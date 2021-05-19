package com.strings;

/*-
    @created 25-01-21

    String.intern(): a string that has the same contents as this string, 
    but is guaranteed to be from a pool of unique strings.
*/

public class StringInternDemo2 {
    public static void main(String[] args) {
        String a1 = "loki"; // new obj in SCP
        String a2 = "lokeshwar".intern(); // new obj in SCP
        String a3 = "loki".intern(); // ensures that already created OBJ from SCP is returned

        StringBuilder sb = new StringBuilder();
        sb.append("\na1 = " + a1 + " @ hashCode = " + a1.hashCode() + " @ intern() = " + a1.intern());
        sb.append("\na2 = " + a2 + " @ hashCode = " + a2.hashCode() + " @ intern() = " + a2.intern());
        sb.append("\na3 = " + a3 + " @ hashCode = " + a3.hashCode() + " @ intern() = " + a3.intern());

        System.out.println(sb);
    }
}

/*-
    OUTPUT:

    a1 = loki @ hashCode = 3327521 @ intern() = loki
    a2 = lokeshwar @ hashCode = 1721443446 @ intern() = lokeshwar
    a3 = loki @ hashCode = 3327521 @ intern() = loki    
*/