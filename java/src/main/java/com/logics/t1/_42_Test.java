package com.logics.t1;

class SpecialString {
    String str;

    SpecialString(String str) {
        this.str = str;
    }
}

public class _42_Test {
    public static void main(String[] args) {
        Object[] arr = new Object[4];
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    arr[i] = new String("Java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3:
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}

/*-

Explanation
Variable 'arr' refers to an Object array of size 4 and null is assigned to all 4 elements of this array.

for-loop starts with i = 1, which means at 1st index String instance is stored, at 2nd index StringBuiler instance is stored and at 3rd index SpecialString instance is stored. null is stored at 0th index.

So, first null will be printed on to the console.

String and StringBuilder classes override toString() method, which prints the text stored in these classes. SpecialString class doesn't override toString() method and hence when instance of SpecialString is printed on to the console, you get: <fully qualified name of SpecialString class>@<hexadecimal representation of hashcode>.

Therefore output will be:

null

Java

Java

<Some text containing @ symbol>
*/