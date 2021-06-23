package com.logics.t3;

public class _39_Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hurrah ! I Passed ...");
        sb.delete(0, 100);
        System.out.println(sb.length());
    }
}

/*-
Explanation
'delete' method accepts 2 parameters: delete(int start, int end), where start is inclusive and end is exclusive.

This method throws StringIndexOutOfBoundsException for following scenarios:

A. start is negative

B. start is greater than sb.length()

C. start is greater than end



If end is greater than the length of StringBuilder object, then StringIndexOutOfBoundsException is not thrown and end is set to sb.length().

So, in this case, `sb.delete(0, 100);` is equivalent to `sb.delete(0, sb.length());` and this deletes all the characters from the StringBuilder object.

Hence, System.out.println(sb.length()); prints 0 on to the console.
*/