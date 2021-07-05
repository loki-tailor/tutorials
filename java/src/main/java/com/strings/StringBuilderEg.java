package com.strings;

/***
 * @created 08-01-2021
 */

 public class StringBuilderEg {
     public static void main(String[] args) {
         StringBuilder sb1 = new StringBuilder(); // capacity = 16 chars (default)
         StringBuilder sb2 = new StringBuilder("abc"); // capcacity = 16 (default) + args.length
         StringBuilder sb3 = new StringBuilder(10); // capacity = 10 (Integer)

         try {

            sb3.append("0123456789");

            System.out.println("sb1 length = " + sb1.length());
            System.out.println("sb2 length = " + sb2.length());
            System.out.println("sb3 length = " + sb3.length());
            System.out.println();

            sb3.insert(10,"1");
            System.out.println("sb1 length = " + sb1.length());
            System.out.println("sb2 length = " + sb2.length());
            System.out.println("sb3 length = " + sb3.length());
            System.out.println();

            // since we are trying to insert @ 13th index & present lenght would be 11, it will give:
            // run-time exception: java.lang.StringIndexOutOfBoundsException: String index out of range: 13
            sb3.insert(13,"2"); 
            
            // won't be printed
            System.out.println("sb1 length = " + sb1.length());
            System.out.println("sb2 length = " + sb2.length());
            System.out.println("sb3 length = " + sb3.length());
            System.out.println();
         } finally {
             System.out.println("Inside Finally");
             System.out.println("sb1.length() = " + sb1.length() + ", sb1.capacity() = " + sb1.capacity());
             System.out.println("sb2.length() = " + sb2.length() + ", sb2.capacity() = " + sb2.capacity());
             System.out.println("sb3.length() = " + sb3.length() + ", sb3.capacity() = " + sb3.capacity());
         }
     }
 }