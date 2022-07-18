package com.consume_cli_args;

/**
 * ref - https://lightrun.com/java/java-tutorial-java-command-line-arguments/
 */
public class UsingDefaultArgs {
    public static void main(String[] args) {
        System.out.println("started");

        for (String arg : args) {
            System.out.println("argument = " + arg);
        }
        System.out.println("end");
    }
}
