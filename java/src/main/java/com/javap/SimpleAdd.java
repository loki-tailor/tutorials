package com.javap;

/*
 * created @ Sun May 16 2021 10:43:57 am
 * ref @ https://www.jrebel.com/blog/java-bytecode-tutorial
 */

public class SimpleAdd {
    public static void main(String[] args) {
        // int a = 1;
        // double b = 3.14;
        // double sum = a + b;

        int a = 1, b = 2, sum = a + b;

        System.out.println(sum);
    }
}

/*-

    output : 4.140000000000001

    javap - v output (when a is int, and b is double, and sum is double)

PS F:\git\tutorials\java\src> javap -v com.javap.SimpleAdd
Classfile /F:/git/tutorials/java/src/com/javap/SimpleAdd.class
  Last modified 16-May-2021; size 601 bytes
  SHA-256 checksum d229a6ad277ff3a059e23c7283035a922adf53b5d88894239a4a70b90ce65e28
  Compiled from "SimpleAdd.java"
public class com.javap.SimpleAdd
  minor version: 0
  major version: 60
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // com/javap/SimpleAdd
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Double             3.14d
   #9 = Fieldref           #10.#11        // java/lang/System.out:Ljava/io/PrintStream;
  #10 = Class              #12            // java/lang/System
  #11 = NameAndType        #13:#14        // out:Ljava/io/PrintStream;
  #12 = Utf8               java/lang/System
  #13 = Utf8               out
  #14 = Utf8               Ljava/io/PrintStream;
  #15 = Methodref          #16.#17        // java/io/PrintStream.println:(D)V
  #16 = Class              #18            // java/io/PrintStream
  #17 = NameAndType        #19:#20        // println:(D)V
  #18 = Utf8               java/io/PrintStream
  #19 = Utf8               println
  #20 = Utf8               (D)V
  #21 = Class              #22            // com/javap/SimpleAdd
  #22 = Utf8               com/javap/SimpleAdd
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lcom/javap/SimpleAdd;
  #28 = Utf8               main
  #29 = Utf8               ([Ljava/lang/String;)V
  #30 = Utf8               args
  #31 = Utf8               [Ljava/lang/String;
  #32 = Utf8               a
  #33 = Utf8               I
  #34 = Utf8               b
  #35 = Utf8               D
  #36 = Utf8               sum
  #37 = Utf8               SourceFile
  #38 = Utf8               SimpleAdd.java
{
  public com.javap.SimpleAdd();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/javap/SimpleAdd;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=6, args_size=1
         0: iconst_1
         1: istore_1
         2: ldc2_w        #7                  // double 3.14d
         5: dstore_2
         6: iload_1
         7: i2d
         8: dload_2
         9: dadd
        10: dstore        4
        12: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        15: dload         4
        17: invokevirtual #15                 // Method java/io/PrintStream.println:(D)V
        20: return
      LineNumberTable:
        line 10: 0
        line 11: 2
        line 12: 6
        line 14: 12
        line 15: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  args   [Ljava/lang/String;
            2      19     1     a   I
            6      15     2     b   D
           12       9     4   sum   D
}
SourceFile: "SimpleAdd.java"    


*/

/*- 

output: 3

javap -v output (when a & b both are integers i.e int a=1, b=2, sum=a+b)

PS F:\git\tutorials\java\src> javap -v com.javap.SimpleAdd
Classfile /F:/git/tutorials/java/src/com/javap/SimpleAdd.class
  Last modified 16-May-2021; size 575 bytes
  SHA-256 checksum 0ba7872c784b7051c6987a01d374d9642dbea5e0bdd962ee88d9fca0723bba09
  Compiled from "SimpleAdd.java"
public class com.javap.SimpleAdd
  minor version: 0
  major version: 60
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #19                         // com/javap/SimpleAdd
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // java/lang/System.out:Ljava/io/PrintStream;
   #8 = Class              #10            // java/lang/System
   #9 = NameAndType        #11:#12        // out:Ljava/io/PrintStream;
  #10 = Utf8               java/lang/System
  #11 = Utf8               out
  #12 = Utf8               Ljava/io/PrintStream;
  #13 = Methodref          #14.#15        // java/io/PrintStream.println:(I)V
  #14 = Class              #16            // java/io/PrintStream
  #15 = NameAndType        #17:#18        // println:(I)V
  #16 = Utf8               java/io/PrintStream
  #17 = Utf8               println
  #18 = Utf8               (I)V
  #19 = Class              #20            // com/javap/SimpleAdd
  #20 = Utf8               com/javap/SimpleAdd
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lcom/javap/SimpleAdd;
  #26 = Utf8               main
  #27 = Utf8               ([Ljava/lang/String;)V
  #28 = Utf8               args
  #29 = Utf8               [Ljava/lang/String;
  #30 = Utf8               a
  #31 = Utf8               I
  #32 = Utf8               b
  #33 = Utf8               sum
  #34 = Utf8               SourceFile
  #35 = Utf8               SimpleAdd.java
{
  public com.javap.SimpleAdd();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/javap/SimpleAdd;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_1
         1: istore_1
         2: iconst_2
         3: istore_2
         4: iload_1
         5: iload_2
         6: iadd
         7: istore_3
        11: iload_3
        12: invokevirtual #13                 // Method java/io/PrintStream.println:(I)V
        15: return
      LineNumberTable:
        line 14: 0
        line 16: 8
        line 17: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  args   [Ljava/lang/String;
            2      14     1     a   I
            4      12     2     b   I
            8       8     3   sum   I
}
SourceFile: "SimpleAdd.java"

*/
