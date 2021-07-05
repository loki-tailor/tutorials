package com.file;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * created @ Sat Jun 19 2021 10:36:33 am
 * ref @ https://stackoverflow.com/questions/50551920/where-to-use-resolve-and-relativize-method-of-java-nio-file-path-class
 */

public class FilesResolveDemo {
    public static void main(String[] args) {
        Path p1 = Paths.get("src").toAbsolutePath();
        Path p2 = Paths.get("reso");

        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));

        Path p3 = Paths.get("src");
        Path p4 = Paths.get("src/res");
        System.out.println(p3.resolve(p4));        
        System.out.println(p4.resolve(p3)); 
        
        Path p5 = p3.toAbsolutePath();
        Path p6 = p4.toAbsolutePath();
        System.out.println(p5.resolve(p6));
        System.out.println(p6.resolve(p5));

    }
}
