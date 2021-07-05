package com.strings;

/*-
    @created 18-01-21

    @description:
        * Demonstrating the byte-code comparison of overidden equals() in StringLatin1 class

        * method code is directly taken from 'StringLatin1' class

        * It basically does 
            > length comparison, if false, returns false, else continue
            > a byte (ASCII) comparison of two strings
            > Returns false for 1st mis-match, else default return true

        * Actual call in 'String' class: StringLatin1.equals(value, aString.value); (1.8)
*/

public class EqualsStrOveridden {
    public static void main(String[] args) {
		String a = "a b c";
		String b = "a b c";
		System.out.println("a.equals(b) = " + equalsFromStrClass(a.getBytes(), b.getBytes()));

        String c = "a    ";
        System.out.println("\nc.equals(b) = " + equalsFromStrClass(c.getBytes(), b.getBytes()));

        // in this 
        String d = "a";
        System.out.println("\nd.equals(b) = " + equalsFromStrClass(d.getBytes(), b.getBytes()));
	}

    // method 
	public static boolean equalsFromStrClass(byte[] value, byte[] other) {
		if (value.length == other.length) {
			for (int i = 0; i < value.length; i++) {
				System.out.println(value[i] + "-" + other[i]);
				if (value[i] != other[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}

/*-
    OUTPUT:

    97-97
    32-32
    98-98
    32-32
    99-99
    a.equals(b) = true
    97-97
    32-32
    32-98

    c.equals(b) = false

    d.equals(b) = false
*/