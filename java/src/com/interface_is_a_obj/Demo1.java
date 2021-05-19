package com.interface_is_a_obj;

import java.io.Serializable;

/*
 * created @ Mon May 17 2021 5:38:51 am
 * ref @ https://programming.guide/java/do-interfaces-inherit-from-object.html
 */

public class Demo1 {
    public static void main(String[] args) {
        Serializable s1 = "abc";
        Serializable s2 = Object.class;

        System.out.println("s1 @ " + s1.toString());
        System.out.println("s2 @ " + s2.toString());
        System.out.println();

        System.out.println("s1 @ " + s1.getClass().getName());
        System.out.println("s1 @ " + s2.getClass().getName());
    }
}

/*-

output:

s1 @ abc
s2 @ class java.lang.Object

s1 @ java.lang.String
s1 @ java.lang.Class

*/

/*-

javap -v output:

PS F:\git\tutorials\java\src> javap -v com.interface_is_a_obj.Demo1
Classfile /F:/git/tutorials/java/src/com/interface_is_a_obj/Demo1.class
  Last modified 17-May-2021; size 1318 bytes
  SHA-256 checksum 91e9d814ca755e87bc245d6162c7387dc37cb07c37d8b843c9e4351ba60e1963
  Compiled from "Demo1.java"
public class com.interface_is_a_obj.Demo1
  minor version: 0
  major version: 60
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #41                         // com/interface_is_a_obj/Demo1
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // abc
   #8 = Utf8               abc
   #9 = Fieldref           #10.#11        // java/lang/System.out:Ljava/io/PrintStream;
  #10 = Class              #12            // java/lang/System
  #11 = NameAndType        #13:#14        // out:Ljava/io/PrintStream;
  #12 = Utf8               java/lang/System
  #13 = Utf8               out
  #14 = Utf8               Ljava/io/PrintStream;
  #15 = Methodref          #2.#16         // java/lang/Object.toString:()Ljava/lang/String;
  #16 = NameAndType        #17:#18        // toString:()Ljava/lang/String;
  #17 = Utf8               toString
  #18 = Utf8               ()Ljava/lang/String;
  #19 = InvokeDynamic      #0:#20         // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #20 = NameAndType        #21:#22        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #21 = Utf8               makeConcatWithConstants
  #22 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #23 = Methodref          #24.#25        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #24 = Class              #26            // java/io/PrintStream
  #25 = NameAndType        #27:#28        // println:(Ljava/lang/String;)V
  #26 = Utf8               java/io/PrintStream
  #27 = Utf8               println
  #28 = Utf8               (Ljava/lang/String;)V
  #29 = InvokeDynamic      #1:#20         // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #30 = Methodref          #24.#31        // java/io/PrintStream.println:()V
  #31 = NameAndType        #27:#6         // println:()V
  #32 = Methodref          #2.#33         // java/lang/Object.getClass:()Ljava/lang/Class;
  #33 = NameAndType        #34:#35        // getClass:()Ljava/lang/Class;
  #34 = Utf8               getClass
  #35 = Utf8               ()Ljava/lang/Class;
  #36 = Methodref          #37.#38        // java/lang/Class.getName:()Ljava/lang/String;
  #37 = Class              #39            // java/lang/Class
  #38 = NameAndType        #40:#18        // getName:()Ljava/lang/String;
  #39 = Utf8               java/lang/Class
  #40 = Utf8               getName
  #41 = Class              #42            // com/interface_is_a_obj/Demo1
  #42 = Utf8               com/interface_is_a_obj/Demo1
  #43 = Utf8               Code
  #44 = Utf8               LineNumberTable
  #45 = Utf8               LocalVariableTable
  #46 = Utf8               this
  #47 = Utf8               Lcom/interface_is_a_obj/Demo1;
  #48 = Utf8               main
  #49 = Utf8               ([Ljava/lang/String;)V
  #50 = Utf8               args
  #51 = Utf8               [Ljava/lang/String;
  #52 = Utf8               s1
  #53 = Utf8               Ljava/io/Serializable;
  #54 = Utf8               s2
  #55 = Utf8               SourceFile
  #56 = Utf8               Demo1.java
  #57 = Utf8               BootstrapMethods
  #58 = MethodHandle       6:#59          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #59 = Methodref          #60.#61        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #60 = Class              #62            // java/lang/invoke/StringConcatFactory
  #61 = NameAndType        #21:#63        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #62 = Utf8               java/lang/invoke/StringConcatFactory
  #63 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #64 = String             #65            // s1 @ \u0001
  #65 = Utf8               s1 @ \u0001
  #66 = String             #67            // s2 @ \u0001
  #67 = Utf8               s2 @ \u0001
  #68 = Utf8               InnerClasses
  #69 = Class              #70            // java/lang/invoke/MethodHandles$Lookup
  #70 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #71 = Class              #72            // java/lang/invoke/MethodHandles
  #72 = Utf8               java/lang/invoke/MethodHandles
  #73 = Utf8               Lookup
{
  public com.interface_is_a_obj.Demo1();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 11: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/interface_is_a_obj/Demo1;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         
         0: ldc           #7                  // String abc
         2: astore_1

         3: ldc           #2                  // class java/lang/Object
         5: astore_2
         
         6: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
         9: aload_1
        
         10: invokevirtual #15                 // Method java/lang/Object.toString:()Ljava/lang/String;
        
         13: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        18: invokevirtual #23                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        21: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        24: aload_2
        25: invokevirtual #15                 // Method java/lang/Object.toString:()Ljava/lang/String;
        28: invokedynamic #29,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        33: invokevirtual #23                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        
        36: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        39: invokevirtual #30                 // Method java/io/PrintStream.println:()V
        42: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        45: aload_1
        46: invokevirtual #32                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        49: invokevirtual #36                 // Method java/lang/Class.getName:()Ljava/lang/String;
        52: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        57: invokevirtual #23                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        60: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        
        63: aload_2
        64: invokevirtual #32                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        67: invokevirtual #36                 // Method java/lang/Class.getName:()Ljava/lang/String;
        70: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        75: invokevirtual #23                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        78: return
      LineNumberTable:
        line 13: 0
        line 14: 3
        line 16: 6
        line 17: 21
        line 18: 36
        line 20: 42
        line 21: 60
        line 22: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  args   [Ljava/lang/String;
            3      76     1    s1   Ljava/io/Serializable;
            6      73     2    s2   Ljava/io/Serializable;
}
SourceFile: "Demo1.java"
BootstrapMethods:
  0: #58 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #64 s1 @ \u0001
  1: #58 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #66 s2 @ \u0001
InnerClasses:
  public static final #73= #69 of #71;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles

  */

