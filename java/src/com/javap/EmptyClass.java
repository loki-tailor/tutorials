package com.javap;
/*
 * created @ Sun May 16 2021 8:48:51 am
 * ref @ 
 */

public class EmptyClass {
}

/*-

javap -v output:

Classfile /F:/git/tutorials/java/src/com/javap/EmptyClass.class
  Last modified 16-May-2021; size 204 bytes
  SHA-256 checksum 720f2a38bdfd91a03c79e24f4ab1045e022d846be2e393a00ad6dc7744b9c3bf
  Compiled from "EmptyClass.java"      
public class com.javap.EmptyClass      
  minor version: 0
  major version: 60
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // com/javap/EmptyClass
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // com/javap/EmptyClass
   #8 = Utf8               com/javap/EmptyClass
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               SourceFile
  #12 = Utf8               EmptyClass.java
{
  public com.javap.EmptyClass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 7: 0
}
SourceFile: "EmptyClass.java"

*/
