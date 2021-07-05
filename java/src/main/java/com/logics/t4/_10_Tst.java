package com.logics.t4;

public class _10_Tst {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);

        sb.append("0123456789");

        sb.delete(8, 1000);

        System.out.println(sb);

    }
}

/*-

Explanation
`new StringBuilder(5);` creates a StringBuilder instance, whose internal char array's length is 5 but the internal char array's length is adjusted when characters are added/removed from the StringBuilder instance. `sb.append("0123456789");` successfully appends "0123456789" to the StringBuilder's instance referred by sb.

delete method accepts 2 parameters: delete(int start, int end), where start is inclusive and end is exclusive.

This method throws StringIndexOutOfBoundsException for following scenarios:

A. start is negative

B. start is greater than sb.length()

C. start is greater than end



If end is greater than the length of StringBuilder object, then StringIndexOutOfBoundsException is not thrown and end is set to sb.length().

So, in this case, `sb.delete(8, 1000);` is equivalent to `sb.delete(8, sb.length());` and this deletes characters at 8th index (8) and 9th index (9). So remaining characters are: "01234567".



StringBuilder class overrides toString() method, which prints the text stored in StringBuilder instance. Hence, `System.out.println(sb);` prints 01234567 on to the console.

*/
