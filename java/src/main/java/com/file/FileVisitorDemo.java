package com.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/***
 * /* created @ Sat Jun 19 2021 10:01:11 am ref @
 */

public class FileVisitorDemo {
    public static void main(String[] args) throws IOException {
        Path dir_1 = Paths.get("src/res").toAbsolutePath();
        System.out.println("dir_1 (as-is) = " + dir_1);
        System.out.println("dir_1.toAbsolutePath() = " + dir_1.toAbsolutePath());
        FileOps.mkdir(dir_1);
        System.out.println();

        Path dir_2 = Paths.get("src/res/fv").toAbsolutePath();
        System.out.println("dir_1 (as-is) = " + dir_2);
        System.out.println("dir_1.toAbsolutePath() = " + dir_2.toAbsolutePath());
        FileOps.mkdir(dir_2);
        System.out.println();

        Path src = Paths.get("src/res/fv/temp").toAbsolutePath();
        System.out.println("temp (as-is) = " + src);
        System.out.println("temp.toAbsolutePath() = " + src.toAbsolutePath());
        FileOps.mkdir(src);
        System.out.println();
        Files.createTempFile(src, "temp", ".txt");

        Path target = Paths.get("src/res/fv/copy").toAbsolutePath();
        System.out.println("copy (as-is) = " + target);
        System.out.println("copy.toAbsolutePath() = " + target.toAbsolutePath());
        FileOps.mkdir(target);
        System.out.println();

        // Files.walkFileTree(temp, new Visitor1(temp.toAbsolutePath(),
        // copy.toAbsolutePath()));

        Files.walkFileTree(src, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

                // new dir path where data is to be copied
                // could be present or absent
                Path resolve = target.resolve(src.relativize(dir));
                File resolve_file = resolve.toFile();

                if (resolve_file.exists() == false) {
                    Files.createDirectory(resolve);
                } else {
                    // delete old data in sub-directories
                    // without deleting the directory
                    Arrays.asList(resolve_file.listFiles()).forEach(File::delete);
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, target.resolve(src.relativize(file)));
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("\nFINISHED EXECUTION");

    }
} // end of class

// below : scrapped
class Visitor1 implements FileVisitor<Path> {

    Path src, dest;

    Visitor1(Path src, Path dest) {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        String tag = "preVisitDirectory";
        // System.out.println("inside " + tag + " for : " + dir);

        // System.out.println("dest.resolve(dir) = " + dest.resolve(dir));
        // System.out.println("src.resolve(dir) = " + src.resolve(dir));
        // System.out.println(dest.resolve(src.relativize(dir)));

        Path dest_new = dest.resolve(src.relativize(dir));
        File dest_new_file = dest_new.toFile();

        // create dir if absent
        if (dest_new_file.isDirectory() && dest_new_file.exists() == false) {
            Files.createDirectory(dest_new);
        }

        Files.copy(src, dest_new, StandardCopyOption.REPLACE_EXISTING);

        // System.out.println();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String tag = "visitFile";
        // System.out.println("inside " + tag + " for : " + file);

        // System.out.println("dest.resolve(file) = " + dest.resolve(file));
        // System.out.println(dest.resolve(src.relativize(file)));
        Path dest_relativize = dest.resolve(src.relativize(file));
        Files.copy(src, dest_relativize, StandardCopyOption.REPLACE_EXISTING);

        // System.out.println();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        String tag = "visitFileFailed";
        // System.out.println("inside " + tag + " for : " + file);
        // System.out.println();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        String tag = "postVisitDirectory";
        // System.out.println("inside " + tag + " for : " + dir);
        // System.out.println();
        return FileVisitResult.CONTINUE;
    }

}
