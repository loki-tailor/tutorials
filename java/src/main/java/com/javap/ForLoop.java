package com.javap;
/*
 * created @ Sun May 16 2021 6:34:45 pm
 * ref @ https://www.jrebel.com/blog/java-bytecode-tutorial
 */

import java.util.ArrayList;
import java.util.List;

// ######################################################

class MovingAverage {
    List<Integer> num_list = null;

    MovingAverage() {
        num_list = new ArrayList<>();
    }

    void submit(int num_param) {
        this.num_list.add(num_param);
    }

    int sum() {
        return num_list.stream().reduce(0, Integer::sum);
    }
} // end of class

// ######################################################

public class ForLoop {
    public static void main(String[] args) {
        MovingAverage ma = new MovingAverage();
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        for (int number : numbers) {
            ma.submit(number);
        }

        System.out.println("sum = " + ma.sum());
    }
}

// ######################################################

// output: sum = 21

/*-
    javap -v output:

PS F:\git\tutorials\java\src> javap -v com.javap.ForLoop
Classfile /F:/git/tutorials/java/src/com/javap/ForLoop.class
  Last modified 16-May-2021; size 1289 bytes
  SHA-256 checksum faef130f2061cc0245d1893f9708b17c9833f4e573ec747b15ac16effcf81e58
  Compiled from "ForLoop.java"
public class com.javap.ForLoop
  minor version: 0
  major version: 60
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #34                         // com/javap/ForLoop
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // com/javap/MovingAverage
   #8 = Utf8               com/javap/MovingAverage
   #9 = Methodref          #7.#3          // com/javap/MovingAverage."<init>":()V
  #10 = Methodref          #7.#11         // com/javap/MovingAverage.submit:(I)V
  #11 = NameAndType        #12:#13        // submit:(I)V
  #12 = Utf8               submit
  #13 = Utf8               (I)V
  #14 = Fieldref           #15.#16        // java/lang/System.out:Ljava/io/PrintStream;
  #15 = Class              #17            // java/lang/System
  #16 = NameAndType        #18:#19        // out:Ljava/io/PrintStream;
  #17 = Utf8               java/lang/System
  #18 = Utf8               out
  #19 = Utf8               Ljava/io/PrintStream;
  #20 = Methodref          #7.#21         // com/javap/MovingAverage.sum:()I
  #21 = NameAndType        #22:#23        // sum:()I
  #22 = Utf8               sum
  #23 = Utf8               ()I
  #24 = InvokeDynamic      #0:#25         // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #25 = NameAndType        #26:#27        // makeConcatWithConstants:(I)Ljava/lang/String;
  #26 = Utf8               makeConcatWithConstants
  #27 = Utf8               (I)Ljava/lang/String;
  #28 = Methodref          #29.#30        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #29 = Class              #31            // java/io/PrintStream
  #30 = NameAndType        #32:#33        // println:(Ljava/lang/String;)V
  #31 = Utf8               java/io/PrintStream
  #32 = Utf8               println
  #33 = Utf8               (Ljava/lang/String;)V
  #34 = Class              #35            // com/javap/ForLoop
  #35 = Utf8               com/javap/ForLoop
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lcom/javap/ForLoop;
  #41 = Utf8               main
  #42 = Utf8               ([Ljava/lang/String;)V
  #43 = Utf8               number
  #44 = Utf8               I
  #45 = Utf8               args
  #46 = Utf8               [Ljava/lang/String;
  #47 = Utf8               ma
  #48 = Utf8               Lcom/javap/MovingAverage;
  #49 = Utf8               numbers
  #50 = Utf8               [I
  #51 = Utf8               StackMapTable
  #52 = Class              #46            // "[Ljava/lang/String;"
  #53 = Class              #50            // "[I"
  #54 = Utf8               SourceFile
  #55 = Utf8               ForLoop.java
  #56 = Utf8               BootstrapMethods
  #57 = MethodHandle       6:#58          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #58 = Methodref          #59.#60        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #59 = Class              #61            // java/lang/invoke/StringConcatFactory
  #60 = NameAndType        #26:#62        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #61 = Utf8               java/lang/invoke/StringConcatFactory
  #62 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #63 = String             #64            // sum = \u0001
  #64 = Utf8               sum = \u0001
  #65 = Utf8               InnerClasses
  #66 = Class              #67            // java/lang/invoke/MethodHandles$Lookup
  #67 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #68 = Class              #69            // java/lang/invoke/MethodHandles
  #69 = Utf8               java/lang/invoke/MethodHandles
  #70 = Utf8               Lookup
{
  public com.javap.ForLoop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/javap/ForLoop;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=7, args_size=1

         0: new           #7                  // class com/javap/MovingAverage
         3: dup
         4: invokespecial #9                  // Method com/javap/MovingAverage."<init>":()V
         7: astore_1

         8: bipush        6
        10: newarray       int
        
        12: dup
        13: iconst_0
        14: iconst_1
        15: iastore
        
        16: dup
        17: iconst_1
        18: iconst_2
        19: iastore
        
        20: dup
        21: iconst_2
        22: iconst_3
        23: iastore
        
        24: dup
        25: iconst_3
        26: iconst_4
        27: iastore
        
        28: dup
        29: iconst_4
        30: iconst_5
        31: iastore
        
        32: dup
        33: iconst_5
        34: bipush        6
        36: iastore
        
        37: astore_2
        38: aload_2
        39: astore_3
        40: aload_3
        41: arraylength
        42: istore        4
        44: iconst_0
        45: istore        5
        
        47: iload         5
        49: iload         4
        51: if_icmpge     72
        54: aload_3
        55: iload         5
        57: iaload
        58: istore        6
        60: aload_1
        61: iload         6
        63: invokevirtual #10                 // Method com/javap/MovingAverage.submit:(I)V
        
        66: iinc          5, 1
        69: goto          47
        
        72: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
        75: aload_1
        76: invokevirtual #20                 // Method com/javap/MovingAverage.sum:()I
        79: invokedynamic #24,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        84: invokevirtual #28                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        87: return
      LineNumberTable:
        line 32: 0
        line 33: 8
        line 35: 38
        line 36: 60
        line 35: 66
        line 39: 72
        line 40: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60       6     6 number   I
            0      88     0  args   [Ljava/lang/String;
            8      80     1    ma   Lcom/javap/MovingAverage;
           38      50     2 numbers   [I
      StackMapTable: number_of_entries = 2
        frame_type = 255 // full_frame
        offset_delta = 47
        locals = [ class "[Ljava/lang/String;", class com/javap/MovingAverage, class "[I", class "[I", int, int ]
        stack = []
      frame_type = 248 // chop
        offset_delta = 24
}
SourceFile: "ForLoop.java"
BootstrapMethods:
0: #57 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  Method arguments:
    #63 sum = \u0001
InnerClasses:
public static final #70= #66 of #68;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles    
    
*/
