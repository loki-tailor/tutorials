package com.strings;

/***
    @created 18-01-21
    Understanding StringBuilder.capacity() & StringBuilder.length()

    length()   
        : currently occupied data length i.e. how much the internal array is currently filled

    capacity() 
        : maximum size the SB can store data (size of the internal array allocated)
        : it is increased based on below formula:
            * sb.new_capacity = (sb.old_capacity * 2) + 2
            or
            * sb.new_capacity = 2 * (sb.old_capacity + 1)

            above both formula will give same results

 */

 public class StringBuilderLenCap {
    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder(1000);
     public static void main(String[] args) {

        for(int j=1; j<=4; j++) {
            for(int i=0; i<=9; i++) {
                sb1.append(i);
                displayLenCap(i);
            }
            System.out.println(j + "\n");
        }

        // sb2 demos
        System.out.println("\nsb2.length() = " + sb2.length() + ", sb2.capacity() = " + sb2.capacity());
        sb2.trimToSize(); // this will make the capacity of sb2 to 0
        System.out.println("sb2.length() = " + sb2.length() + ", sb2.capacity() = " + sb2.capacity());
        sb2.append(1);
        System.out.println("sb2.length() = " + sb2.length() + ", sb2.capacity() = " + sb2.capacity());
        sb2.ensureCapacity(1);
        System.out.println("sb2.length() (after ensureCapacity(1)) = " + sb2.length() + ", sb2.capacity() = " + sb2.capacity());
        sb2.ensureCapacity(3);
        System.out.println("sb2.length() (after ensureCapacity(1)) = " + sb2.length() + ", sb2.capacity() = " + sb2.capacity());
     }

    // display stringbuilder length & capacity
     static void displayLenCap(int s) {
         System.out.println(String.valueOf(s) + " : sb1.length() = " + sb1.length() + ", sb1.capacity() = " + sb1.capacity());
     }

     public static void capacityCheck(String[] args) {
         // testing capacity 2 different formulas
         System.out.println("formula 1 = (oldCap * 2) + 2: ");
         int oldCap = 16;
         for(int i=0; i<=3; i++) {
             int newCap = (oldCap * 2) + 2;
             System.out.println(oldCap + " - " + newCap);
             oldCap = newCap;
         }

         System.out.println("\nformula 2 = 2 * (oldCap + 1):");
         oldCap = 16;
         for(int i=0; i<=3; i++) {
             int newCap = 2 * (oldCap + 1);
             System.out.println(oldCap + " - " + newCap);
             oldCap = newCap;
         }

         /*-
                OUTPUT:

                formula 1 = (oldCap * 2) + 2: 
                16 - 34
                34 - 70
                70 - 142
                142 - 286

                formula 2 = 2 * (oldCap + 1):
                16 - 34
                34 - 70
                70 - 142
                142 - 286        
          */

     }
 }

 /*-
    OUTPUT (1st main):

    0 : sb1.length() = 1, sb1.capacity() = 16
    1 : sb1.length() = 2, sb1.capacity() = 16 
    2 : sb1.length() = 3, sb1.capacity() = 16 
    3 : sb1.length() = 4, sb1.capacity() = 16 
    4 : sb1.length() = 5, sb1.capacity() = 16 
    5 : sb1.length() = 6, sb1.capacity() = 16 
    6 : sb1.length() = 7, sb1.capacity() = 16 
    7 : sb1.length() = 8, sb1.capacity() = 16 
    8 : sb1.length() = 9, sb1.capacity() = 16 
    9 : sb1.length() = 10, sb1.capacity() = 16
    1

    0 : sb1.length() = 11, sb1.capacity() = 16
    1 : sb1.length() = 12, sb1.capacity() = 16
    2 : sb1.length() = 13, sb1.capacity() = 16
    3 : sb1.length() = 14, sb1.capacity() = 16
    4 : sb1.length() = 15, sb1.capacity() = 16
    5 : sb1.length() = 16, sb1.capacity() = 16
    6 : sb1.length() = 17, sb1.capacity() = 34
    7 : sb1.length() = 18, sb1.capacity() = 34
    8 : sb1.length() = 19, sb1.capacity() = 34
    9 : sb1.length() = 20, sb1.capacity() = 34
    2

    0 : sb1.length() = 21, sb1.capacity() = 34
    1 : sb1.length() = 22, sb1.capacity() = 34
    2 : sb1.length() = 23, sb1.capacity() = 34
    3 : sb1.length() = 24, sb1.capacity() = 34
    4 : sb1.length() = 25, sb1.capacity() = 34
    5 : sb1.length() = 26, sb1.capacity() = 34
    6 : sb1.length() = 27, sb1.capacity() = 34
    7 : sb1.length() = 28, sb1.capacity() = 34
    8 : sb1.length() = 29, sb1.capacity() = 34
    9 : sb1.length() = 30, sb1.capacity() = 34
    3

    0 : sb1.length() = 31, sb1.capacity() = 34
    1 : sb1.length() = 32, sb1.capacity() = 34
    2 : sb1.length() = 33, sb1.capacity() = 34
    3 : sb1.length() = 34, sb1.capacity() = 34
    4 : sb1.length() = 35, sb1.capacity() = 70
    5 : sb1.length() = 36, sb1.capacity() = 70
    6 : sb1.length() = 37, sb1.capacity() = 70
    7 : sb1.length() = 38, sb1.capacity() = 70
    8 : sb1.length() = 39, sb1.capacity() = 70
    9 : sb1.length() = 40, sb1.capacity() = 70
    4


    sb2.length() = 0, sb2.capacity() = 1000
    sb2.length() = 0, sb2.capacity() = 0
    sb2.length() = 1, sb2.capacity() = 2
    sb2.length() (after ensureCapacity(1)) = 1, sb2.capacity() = 2
    sb2.length() (after ensureCapacity(1)) = 1, sb2.capacity() = 6

 */

