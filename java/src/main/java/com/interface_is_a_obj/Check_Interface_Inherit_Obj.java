package com.interface_is_a_obj;

/*
 * created @ Sun May 16 2021 9:46:19 am
 * ref @ https://stackoverflow.com/a/6057181/7415499
 * 
 * Q1 - Which class is by default extended by all classes in Java?
 * Q2 - Do all the interfaces in java have any common supertype? (aka do they inherit/extend/implemt something?)
 * Q3 - If yes, what, and can you write a code that demonstrates the same?
 */


public class Check_Interface_Inherit_Obj {

    public static void main(String[] args) {
        Games c1 = new Cycling();
        test(c1);

        System.out.println(c1.getClass().isInterface());
        System.out.println(Cycling.class.isInterface());
        System.out.println(Games.class.isInterface());
    }

    public static void test(Object obj) {
        System.out.println(obj.getClass().isInterface());
    }
}

interface Games {
}

class Cycling implements Games {
}

/*-

output:

false
false
false
true

*/

/*-
javap -v output:

PS F:\git\tutorials\java\src> javap -v com.javap.Check_Interface_Inherit_Obj
Classfile /F:/git/tutorials/java/src/com/javap/Check_Interface_Inherit_Obj.class
  Last modified 16-May-2021; size 945 bytes
  SHA-256 checksum e67fd430a9d7fa16e23c6f4f000de2750796b93f605083671d206aa57d60a431
  Compiled from "Check_Interface_Inherit_Obj.java"
public class com.javap.Check_Interface_Inherit_Obj
  minor version: 0
  major version: 60
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // com/javap/Check_Interface_Inherit_Obj
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // com/javap/Cycling
   #8 = Utf8               com/javap/Cycling
   #9 = Methodref          #7.#3          // com/javap/Cycling."<init>":()V
  #10 = Methodref          #11.#12        // com/javap/Check_Interface_Inherit_Obj.test:(Ljava/lang/Object;)V
  #11 = Class              #13            // com/javap/Check_Interface_Inherit_Obj
  #12 = NameAndType        #14:#15        // test:(Ljava/lang/Object;)V
  #13 = Utf8               com/javap/Check_Interface_Inherit_Obj
  #14 = Utf8               test
  #15 = Utf8               (Ljava/lang/Object;)V
  #16 = Fieldref           #17.#18        // java/lang/System.out:Ljava/io/PrintStream;
  #17 = Class              #19            // java/lang/System
  #18 = NameAndType        #20:#21        // out:Ljava/io/PrintStream;
  #19 = Utf8               java/lang/System
  #20 = Utf8               out
  #21 = Utf8               Ljava/io/PrintStream;
  #22 = Methodref          #2.#23         // java/lang/Object.getClass:()Ljava/lang/Class;
  #23 = NameAndType        #24:#25        // getClass:()Ljava/lang/Class;
  #24 = Utf8               getClass
  #25 = Utf8               ()Ljava/lang/Class;
  #26 = Methodref          #27.#28        // java/lang/Class.isInterface:()Z
  #27 = Class              #29            // java/lang/Class
  #28 = NameAndType        #30:#31        // isInterface:()Z
  #29 = Utf8               java/lang/Class
  #30 = Utf8               isInterface
  #31 = Utf8               ()Z
  #32 = Methodref          #33.#34        // java/io/PrintStream.println:(Z)V
  #33 = Class              #35            // java/io/PrintStream
  #34 = NameAndType        #36:#37        // println:(Z)V
  #35 = Utf8               java/io/PrintStream
  #36 = Utf8               println
  #37 = Utf8               (Z)V
  #38 = Class              #39            // com/javap/Games
  #39 = Utf8               com/javap/Games
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lcom/javap/Check_Interface_Inherit_Obj;
  #45 = Utf8               main
  #46 = Utf8               ([Ljava/lang/String;)V
  #47 = Utf8               args
  #48 = Utf8               [Ljava/lang/String;
  #49 = Utf8               c1
  #50 = Utf8               Lcom/javap/Games;
  #51 = Utf8               obj
  #52 = Utf8               Ljava/lang/Object;
  #53 = Utf8               SourceFile
  #54 = Utf8               Check_Interface_Inherit_Obj.java
{
  public com.javap.Check_Interface_Inherit_Obj();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 13: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/javap/Check_Interface_Inherit_Obj;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: new           #7                  // class com/javap/Cycling
         3: dup
         4: invokespecial #9                  // Method com/javap/Cycling."<init>":()V
         7: astore_1
         8: aload_1
         9: invokestatic  #10                 // Method test:(Ljava/lang/Object;)V
        12: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
        15: aload_1
        16: invokevirtual #22                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        19: invokevirtual #26                 // Method java/lang/Class.isInterface:()Z
        22: invokevirtual #32                 // Method java/io/PrintStream.println:(Z)V
        25: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
        28: ldc           #7                  // class com/javap/Cycling
        30: invokevirtual #26                 // Method java/lang/Class.isInterface:()Z
        33: invokevirtual #32                 // Method java/io/PrintStream.println:(Z)V
        36: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
        39: ldc           #38                 // class com/javap/Games
        41: invokevirtual #26                 // Method java/lang/Class.isInterface:()Z
        44: invokevirtual #32                 // Method java/io/PrintStream.println:(Z)V
        47: return
      LineNumberTable:
        line 16: 0
        line 17: 8
        line 19: 12
        line 20: 25
        line 21: 36
        line 22: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  args   [Ljava/lang/String;
            8      40     1    c1   Lcom/javap/Games;

  public static void test(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_0
         4: invokevirtual #22                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         7: invokevirtual #26                 // Method java/lang/Class.isInterface:()Z
        10: invokevirtual #32                 // Method java/io/PrintStream.println:(Z)V
        13: return
      LineNumberTable:
        line 25: 0
        line 26: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0   obj   Ljava/lang/Object;
}
SourceFile: "Check_Interface_Inherit_Obj.java"

*/