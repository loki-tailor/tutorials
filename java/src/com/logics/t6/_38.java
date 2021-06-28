package com.logics.t6;

public class _38 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for (;;) {
                sb.append("OCA");
            }
        } catch (Exception e) {
            System.out.println("Lokeshwar : Exception !!");
        } finally {
            System.out.println("i am finally..");
        }
        System.out.println("main ends...");
    }
}
/*-

i am finally..
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Arrays.java:3332)
        at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)                                                                 m Files\Java\jdk1.8.0_261
        at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:448)
        at java.lang.StringBuilder.append(StringBuilder.java:136)                                                                                                 erify that the path 
        at com.logics.t6._38.main(_38.java:8)

Explanation
for(;;) is an infinite loop and hence `sb.append("OCA");` causes OutOfMemoryError which is a subclass of Error class.

main(String []) method throws OutOfMemoryError and program terminates abruptly.        

*/
