package com.javap;
/*
 * created @ Sun May 16 2021 9:13:00 am
 * ref @ 
 */

public interface EmptyInterface {

}

/*-

javap -v output:

PS F:\git\tutorials\java\src> javap -v com.javap.EmptyInterface
Classfile /F:/git/tutorials/java/src/com/javap/EmptyInterface.class
  Last modified 16-May-2021; size 119 bytes
  SHA-256 checksum 895129a35184cac81398a3df76387f49ed500af4e548a47a8c84b4f8e5526828
  Compiled from "EmptyInterface.java"
public interface com.javap.EmptyInterface
  minor version: 0
  major version: 60
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // com/javap/EmptyInterface
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 0, attributes: 1
Constant pool:
  #1 = Class              #2              // com/javap/EmptyInterface
  #2 = Utf8               com/javap/EmptyInterface
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               SourceFile
  #6 = Utf8               EmptyInterface.java
{
}
SourceFile: "EmptyInterface.java

*/
